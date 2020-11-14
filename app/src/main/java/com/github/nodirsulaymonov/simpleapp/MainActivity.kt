package com.github.nodirsulaymonov.simpleapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.second_page.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_page)
    }

    fun onSendEmail(view: View) {
        val email = Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, "nnnn@mail.ru");
        email.putExtra(Intent.EXTRA_SUBJECT, "Отправлено");
        email.putExtra(Intent.EXTRA_TEXT, "Hello");

        //need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :"));
    }

    fun onOpenProfile(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }
}

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_page)

        etName.setText(savedInstanceState?.getString("editText", ""))
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("editText", etName.text.toString())
    }
}