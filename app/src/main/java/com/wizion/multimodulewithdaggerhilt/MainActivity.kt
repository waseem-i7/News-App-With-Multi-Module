package com.wizion.multimodulewithdaggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.wizion.common_utils.Activities
import com.wizion.common_utils.Navigator
import com.wizion.multimodulewithdaggerhilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var provider : Navigator.Provider

    private var _binding : ActivityMainBinding? = null
    private val binding : ActivityMainBinding
    get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(this,R.color.white)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Handler(Looper.myLooper()!!).postDelayed({
            provider.getActivities(Activities.NewsActivity).navigate(this)
            finish()
        },1500)

    }
}













