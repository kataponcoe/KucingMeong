package id.kataponcoe.kucingmeong

/**
 * Created by Poncoe on 03/11/17.
 */

import android.app.Activity
import android.os.Bundle
import android.view.View

class TidakTersedia : Activity() {


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tidak_tersedia)
    }

    fun onClick(arg0: View) {
        // TODO Auto-generated method stub
        finish()
    }
}
