package my.edu.tarc.helloskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

// Instant Name : Data Type / Class Name
class MainActivity : AppCompatActivity() {
    // onCreate = main function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Load UI to memory
        // R = resources
        setContentView(R.layout.activity_main)

        // Declare variable; val = value (constant), var = variable (will change depends on situation)
        val imgQR : ImageView = findViewById(R.id.imgQR)
        val lblName : TextView = findViewById(R.id.lblName)
        val btnShow : Button = findViewById(R.id.btnShow)
        val btnHide : Button = findViewById(R.id.btnHide)

        btnShow.setOnClickListener {
            imgQR.visibility = View.VISIBLE
            lblName.visibility = View.VISIBLE
        }

        btnHide.setOnClickListener {
            imgQR.visibility = View.INVISIBLE
            lblName.visibility = View.INVISIBLE
        }

    }
}