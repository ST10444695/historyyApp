package za.ac.iie.myhistoryapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var hstFigures = arrayOf<String>("Josef Stalin", "Julius Caesar", "Christopher Columbus",
            "Adolf Hitler","Genghis Khan","Queen Elizabeth","Saddam Hussein",
        "Pope Innocent III","Ivan the Terrible ","Idi Amin")

    private var initialText = "Initial Text"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var edtTxt1 = findViewById<EditText>(R.id.edtTxt1)
        var edtTxt2 = findViewById<EditText>(R.id.edtTxt2)
        var hstfiguresTxtView = findViewById<TextView>(R.id.hstfiguresTxtView)
        var btnCalc = findViewById<Button>(R.id.btnCalc)
        var btnClear = findViewById<Button>(R.id.btnClear)



        hstfiguresTxtView.text = hstFigures[0]
            var ageInt = when
                hstFigures[75] = "Josef Stalin"
                        hstFigures [55] = "Julius Caesar"
                        hstFigures [54] = "Christopher Columbus"
                        hstFigures [56] = "Adolf Hitler"
                        hstFigures [65] = "Genghis Khan"
                        hstFigures [69] = "Queen Elizabeth"
                        hstFigures [69] = "Saddam Hussein"
                        hstFigures [55] = "Ivan the Terrible "
                        hstFigures [55] = "Ivan the Terrible "
                        hstFigures [74] = "Idi Amin"



        btnCalc.setOnClickListener() {
            var age = edtTxt2.text.toString().toInt()
            if (age < hstFigures.size) {
                hstfiguresTxtView.text = hstFigures[age]
            } else {
                if(age != null) {
                    hstfiguresTxtView.setText("$ageInt: $age")

            } else {
                    hstfiguresTxtView.setText("$ageInt")

                }
                if(age < 20 || age > 100){
                    hstfiguresTxtView.text = "Invalid age input."

            }


                btnClear.setOnClickListener(){
                    edtTxt2.setText("")
                    hstfiguresTxtView.text = ""

            }


            }

            }

            }








