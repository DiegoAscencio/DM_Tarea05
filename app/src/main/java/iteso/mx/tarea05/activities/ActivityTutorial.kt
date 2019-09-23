package iteso.mx.tarea05.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import iteso.mx.tarea05.R
import iteso.mx.tarea05.fragments.FragmentTutorial1
import iteso.mx.tarea05.fragments.FragmentTutorial2
import iteso.mx.tarea05.fragments.FragmentTutorial3
import kotlinx.android.synthetic.main.activity_tutorial.*
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity

class ActivityTutorial : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        /* TODO Create three fragments for the tutorial and place them in activity_tutorial_fl_content
        *   First Fragment has a background image and a next button
        *   Second Fragment has a background image a next and previous button
        *   Third Fragment has a background image a finish and a previous button
        *  */
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.activity_main_fl_main_content,FragmentTutorial1())
            .commit()

}

    fun bt_click_next(view: View){
       when(view.id){
           R.id.f1activity_tutorial_btn_next ->supportFragmentManager
               .beginTransaction()
               .replace(R.id.activity_main_fl_main_content,FragmentTutorial2())
               .commit()
            R.id.f2activity_tutorial_btn_next->supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_main_fl_main_content,FragmentTutorial3())
                .commit()
           R.id.f3activity_tutorial_btn_next ->
                startActivity<ActivityMain>()
       }
    }

    fun bt_click_prev(view: View){
        when(view.id){
            R.id.f2activity_tutorial_btn_previous->supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_main_fl_main_content,FragmentTutorial1())
                .commit()
            R.id.f3activity_tutorial_btn_previous ->supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_main_fl_main_content,FragmentTutorial2())
                .commit()
        }
    }
}
