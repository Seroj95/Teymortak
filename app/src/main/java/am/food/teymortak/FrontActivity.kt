package am.food.teymortak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock

class FrontActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front)
        Thread(Runnable {
            SystemClock.sleep(2000)
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)

        }).start()

    }
}
