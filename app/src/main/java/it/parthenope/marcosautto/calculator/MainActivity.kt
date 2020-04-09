package it.parthenope.marcosautto.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var opCode = 0                      //0 = START | 1 = SUM | 2 = MINUS | 3 = TIMES | 4 = DIVIDE
    var value = 0.0                     //CONTIENE IL VALORE DEL CALCOLO
    var isDecimal = 0                   //INDICA SE STO INSERENDO UN NUMERO DECIMALE

    fun doCalcs(num: Float){
        when (opCode){
            1 -> value += num
            2 -> value -= num
            3 -> value *= num
            4 -> value /= num
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ZeroBtn = findViewById<Button>(R.id.ZeroBtn)
        val OneBtn = findViewById<Button>(R.id.OneBtn)
        val TwoBtn = findViewById<Button>(R.id.TwoBtn)
        val ThreeBtn = findViewById<Button>(R.id.ThreeBtn)
        val FourBtn = findViewById<Button>(R.id.FourBtn)
        val FiveBtn = findViewById<Button>(R.id.FiveBtn)
        val SixBtn = findViewById<Button>(R.id.SixBtn)
        val SevenBtn = findViewById<Button>(R.id.SevenBtn)
        val EigthBtn = findViewById<Button>(R.id.EigthBtn)
        val NineBtn = findViewById<Button>(R.id.NineBtn)
        val PlusBtn = findViewById<Button>(R.id.PlusBtn)
        val MinusBtn = findViewById<Button>(R.id.MinusBtn)
        val TimesBtn = findViewById<Button>(R.id.TimesBtn)
        val DivideBtn = findViewById<Button>(R.id.DivideBtn)
        val EqualsBtn = findViewById<Button>(R.id.EqualsBtn)
        val DotBtn = findViewById<Button>(R.id.DotBtn)
        val CancBtn = findViewById<Button>(R.id.CancBtn)
        val CancAllBtn = findViewById<Button>(R.id.CancAllBtn)
        var CalcText = findViewById<TextView>(R.id.CalcText)
        var valueText = ""                 //STRINGA DA VISUALIZZARE A SCHEREMO


        ZeroBtn.setOnClickListener{
            //if(valueText == "0"){ CalcText.text.dropLast(1) }       //CANCELLA LO ZERO INIZIALE
            valueText = valueText + "0"
            CalcText.append("0")
        }
        OneBtn.setOnClickListener{
            if(valueText.equals("0")){ valueText = ""
                CalcText.setText("")
            }
            valueText = valueText + "1"
            CalcText.append("1")
            if(isDecimal != 1){ doCalcs(valueText.toFloat()) }
        }
        TwoBtn.setOnClickListener{
            if(valueText.equals("0")){ valueText = ""
                CalcText.setText("")
            }
            valueText = valueText + "2"
            CalcText.append("2")
            if(isDecimal != 1){ doCalcs(valueText.toFloat()) }
        }
        ThreeBtn.setOnClickListener{
            if(valueText.equals("0")){ valueText = ""
                CalcText.setText("")
            }
            valueText = valueText + "3"
            CalcText.append("3")
            if(isDecimal != 1){ doCalcs(valueText.toFloat()) }
        }
        FourBtn.setOnClickListener{
            if(valueText.equals("0")){ valueText = ""
                CalcText.setText("")
            }
            valueText = valueText + "4"
            CalcText.append("4")
            if(isDecimal != 1){ doCalcs(valueText.toFloat()) }
        }
        FiveBtn.setOnClickListener{
            if(valueText.equals("0")){ valueText = ""
                CalcText.setText("")
            }
            valueText = valueText + "5"
            CalcText.append("5")
            if(isDecimal != 1){ doCalcs(valueText.toFloat()) }
        }
        SixBtn.setOnClickListener{
            if(valueText.equals("0")){ valueText = ""
                CalcText.setText("")
            }
            valueText = valueText + "6"
            CalcText.append("6")
            if(isDecimal != 1){ doCalcs(valueText.toFloat()) }
        }
        SevenBtn.setOnClickListener{
            if(valueText.equals("0")){ valueText = ""
                CalcText.setText("")
            }
            valueText = valueText + "7"
            CalcText.append("7")
            if(isDecimal != 1){ doCalcs(valueText.toFloat()) }
        }
        EigthBtn.setOnClickListener{
            if(valueText.equals("0")){ valueText = ""
                CalcText.setText("")
            }
            valueText = valueText + "8"
            CalcText.append("8")
            if(isDecimal != 1){ doCalcs(valueText.toFloat()) }
        }
        NineBtn.setOnClickListener{
            if(valueText.equals("0")){ valueText = ""
                CalcText.setText("")
            }
            valueText = valueText + "9"
            CalcText.append("9")
            if(isDecimal != 1){ doCalcs(valueText.toFloat()) }
        }

        PlusBtn.setOnClickListener{
            CalcText.append(" + ")
            isDecimal = 0

            if(opCode == 0){
                value += valueText.toFloat()
                opCode = 1
            }       //SE È LA PRIMA OPERAZIONE IL VAR INIZIALE È LA PRIMA CIFRA CHE SELEZIONO
            else {
                opCode = 1
            }
            valueText = ""                  //PULISCI LA CIFRA
        }

        MinusBtn.setOnClickListener{
            CalcText.append(" - ")
            isDecimal = 0

            if(opCode == 0){
                value += valueText.toFloat()       //SE È LA PRIMA OPERAZIONE IL VAR INIZIALE È LA PRIMA CIFRA CHE SELEZIONO
                opCode = 2
            }
            else {
                opCode = 2
            }
            valueText = ""                  //PULISCI LA CIFRA
        }

        TimesBtn.setOnClickListener{
            CalcText.append(" * ")
            isDecimal = 0

            if(opCode == 0){
                value += valueText.toFloat()       //SE È LA PRIMA OPERAZIONE IL VAR INIZIALE È LA PRIMA CIFRA CHE SELEZIONO
                opCode = 3 }
            else {
                opCode = 3
            }
            valueText = ""                  //PULISCI LA CIFRA
        }

        DivideBtn.setOnClickListener{
            CalcText.append(" / ")
            isDecimal = 0

            if(opCode == 0){
                value += valueText.toFloat()       //SE È LA PRIMA OPERAZIONE IL VAR INIZIALE È LA PRIMA CIFRA CHE SELEZIONO
                opCode = 4 }
            else {
                opCode = 4
            }
            valueText = ""                  //PULISCI LA CIFRA
        }

        DotBtn.setOnClickListener{
            CalcText.append(".")
            valueText = valueText + "."
            isDecimal = 1
        }

        EqualsBtn.setOnClickListener{
          //  doCalcs(valueText.toFloat())      //EFFETTUA L'ULTIMO CALCOLO

            CalcText.setText("%.5f".format(value).toString())   //CI INTERESSANO 5 CIFRE DECIMALI
            valueText = "0.0"
            isDecimal = 0
            //valueText = ""                  //PULISCI LA CIFRA
        }

        CancBtn.setOnClickListener {
            valueText = valueText.dropLast(1)
            CalcText.setText( CalcText.text.dropLast(1) )
        }

        CancAllBtn.setOnClickListener{
            CalcText.setText("0")
            valueText = "0"
            value = 0.0
            opCode = 0
            isDecimal = 0
        }

    }
}
