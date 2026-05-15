package com.example.mmfinalproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.security.MessageDigest

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(com.example.mmfinalproject.R.layout.activity_main)

        val etUsername = findViewById<EditText>(com.example.mmfinalproject.R.id.etUsername)
        val etEmail = findViewById<EditText>(com.example.mmfinalproject.R.id.etEmail)
        val etPassword = findViewById<EditText>(com.example.mmfinalproject.R.id.etPassword)
        val btnLogin = findViewById<Button>(com.example.mmfinalproject.R.id.btnLogin)
        val btnRegister = findViewById<Button>(com.example.mmfinalproject.R.id.btnRegister)

        btnRegister.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (!validateInput(username, email, password, etUsername, etEmail, etPassword)) {
                return@setOnClickListener
            }

            val db = AppDatabase.getDatabase(this)

            Thread {
                val existingUser = db.userDao().getUserByEmail(email)

                if (existingUser != null) {
                    runOnUiThread {
                        Toast.makeText(this, "User already registered. Please login.", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    val user = UserEntity(
                        username = username,
                        email = email,
                        passwordHash = hashPassword(password)
                    )

                    db.userDao().insertUser(user)

                    runOnUiThread {
                        Toast.makeText(this, "Registration successful. Please login.", Toast.LENGTH_SHORT).show()
                    }
                }
            }.start()
        }

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (!validateInput(username, email, password, etUsername, etEmail, etPassword)) {
                return@setOnClickListener
            }

            val db = AppDatabase.getDatabase(this)

            Thread {
                val existingUser = db.userDao().getUserByEmail(email)
                val enteredHash = hashPassword(password)

                if (existingUser == null) {
                    runOnUiThread {
                        Toast.makeText(this, "User not found. Please register first.", Toast.LENGTH_SHORT).show()
                    }
                } else if (existingUser.passwordHash != enteredHash) {
                    runOnUiThread {
                        Toast.makeText(this, "Incorrect password", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    runOnUiThread {
                        val prefs = getSharedPreferences("login_status", MODE_PRIVATE)
                        prefs.edit().putBoolean("isLoggedIn", true).apply()

                        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this, HomeActivity::class.java))
                        finish()
                    }
                }
            }.start()
        }
    }


    private fun validateInput(
        username: String,
        email: String,
        password: String,
        etUsername: EditText,
        etEmail: EditText,
        etPassword: EditText
    ): Boolean {
        if (username.isEmpty()) {
            etUsername.error = "Enter username"
            return false
        }

        if (email.isEmpty()) {
            etEmail.error = "Enter email"
            return false
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etEmail.error = "Enter valid email"
            return false
        }

        if (password.isEmpty()) {
            etPassword.error = "Enter password"
            return false
        }

        if (password.length < 6) {
            etPassword.error = "Password must be at least 6 characters"
            return false
        }

        return true
    }

    private fun hashPassword(password: String): String {
        val bytes = MessageDigest.getInstance("SHA-256").digest(password.toByteArray())
        return bytes.joinToString("") { "%02x".format(it) }
    }
}
