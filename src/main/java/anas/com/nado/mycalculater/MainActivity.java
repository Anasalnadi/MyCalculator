package anas.com.nado.mycalculater;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView input, signBox;
    private String sign, value1, value2;
    private Double num1, num2, result;
    private boolean hasDot;

    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonDot
            ,buttonClear,buttonDivid,buttonMulltipl,buttonAdd,buttonSub,buttonEqual,buttonBackSpace,buttonSin
            ,buttonCos,buttonTan,buttonPower;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Creat",Toast.LENGTH_LONG).show();

        praperCalc();
        setupButton();


    }

    void praperCalc(){
        //Text View
        input=findViewById(R.id.input);
        signBox=findViewById(R.id.sign);

        //Number
        button0=findViewById(R.id.button0);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        buttonDot=findViewById(R.id.button_dotte);

        hasDot=false;

        //Operation
        buttonDivid=findViewById(R.id.button_divid);
        buttonMulltipl=findViewById(R.id.button_multipl);
        buttonAdd=findViewById(R.id.button_add);
        buttonSub=findViewById(R.id.button_sub);
        buttonSin=findViewById(R.id.button_sin);
        buttonCos=findViewById(R.id.button_cos);
        buttonTan=findViewById(R.id.button_tan);
        buttonPower=findViewById(R.id.button_power);
        buttonEqual=findViewById(R.id.button_equal);

        //Spical
        buttonClear=findViewById(R.id.buttonClear);
        buttonBackSpace=findViewById(R.id.button_back_space);

    }
    void setupButton(){
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText()+"9");
            }
        });


        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!hasDot){
                    if(input.getText().equals("")){
                        input.setText("0.");
                    }else {
                        input.setText(input.getText()+".");
                    }
                    hasDot=true;
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="+";
                value1=input.getText().toString();
                input.setText(null);
                signBox.setText("+");
                hasDot=false;
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="-";
                value1=input.getText().toString();
                input.setText(null);
                signBox.setText("-");
                hasDot=false;
            }
        });

        buttonMulltipl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="*";
                value1=input.getText().toString();
                input.setText(null);
                signBox.setText("*");
                hasDot=false;
            }
        });

        buttonDivid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="/";
                value1=input.getText().toString();
                input.setText(null);
                signBox.setText("÷");
                hasDot=false;
            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="sin";
                //value1=input.getText().toString();
                input.setText(null);
                signBox.setText("sin");
                hasDot=false;
            }
        });

        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="cos";
                //value1=input.getText().toString();
                input.setText(null);
                signBox.setText("cos");
                hasDot=false;
            }
        });

        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="tan";
                //value1=input.getText().toString();
                input.setText(null);
                signBox.setText("tan");
                hasDot=false;
            }
        });

        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign="power";
                value1=input.getText().toString();
                input.setText(null);
                signBox.setText("xⁿ");
                hasDot=false;
            }
        });

        buttonBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int lenght=input.getText().length();
                String s=input.getText().toString();

                if(!input.getText().equals("")){
                     if(s.charAt(lenght-1)=='.'){
                         hasDot=false;
                         input.setText(input.getText().subSequence(0,input.getText().length()-1));
                        }else {
                        input.setText(input.getText().subSequence(0,input.getText().length()-1));
                        }
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(null);
                signBox.setText(null);
                value1 = null;
                value2 = null;
                sign = null;
                hasDot = false;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sign==null){
                    signBox.setText("Error!!");
                }else if (input.getText().equals("")){
                    signBox.setText("Error!!");
                }else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")){
                    signBox.setText("Error!!");
                }
                else {
                    switch (sign){
                        case "+":
                            value2=input.getText().toString();
                            num1=Double.parseDouble(value1);
                            num2=Double.parseDouble(value2);
                            result=num1+num2;
                            input.setText(result.toString());
                            sign=null;
                            signBox.setText(null);
                            break;

                        case "-":
                            value2=input.getText().toString();
                            num1=Double.parseDouble(value1);
                            num2=Double.parseDouble(value2);
                            result=num1-num2;
                            input.setText(result.toString());
                            sign=null;
                            signBox.setText(null);
                            break;

                        case "*":
                            value2=input.getText().toString();
                            num1=Double.parseDouble(value1);
                            num2=Double.parseDouble(value2);
                            result=num1*num2;
                            input.setText(result.toString());
                            sign=null;
                            signBox.setText(null);
                            break;

                        case "/":
                            value2=input.getText().toString();
                            num1=Double.parseDouble(value1);
                            num2=Double.parseDouble(value2);
                            result=num1/num2;
                            input.setText(result.toString());
                            sign=null;
                            signBox.setText(null);
                            break;

                        case"sin":
                            value1=input.getText().toString();
                            num1=Double.parseDouble(value1);
                            input.setText(Math.sin(num1)+"");
                            sign=null;
                            signBox.setText(null);
                            break;

                        case"cos":
                            value1=input.getText().toString();
                            num1=Double.parseDouble(value1);
                            input.setText(Math.cos(num1)+"");
                            sign=null;
                            signBox.setText(null);
                            break;

                        case"tan":
                            value1=input.getText().toString();
                            num1=Double.parseDouble(value1);
                            input.setText(Math.tan(num1)+"");
                            sign=null;
                            signBox.setText(null);
                            break;

                        case"power":
                            num1=Double.parseDouble(value1);
                            value2=input.getText().toString();
                            num2=Double.parseDouble(value2);
                            result=Math.pow(num1,num2);
                            input.setText(result+"");
                            sign=null;
                            signBox.setText(null);
                            break;

                        default:
                            break;
                    }

                }

            }
        });

    }



    // Activaty Life Cycle


    @Override
    protected void onStart() {
        super.onStart();

       // Toast.makeText(this,"Sart",Toast.LENGTH_LONG).show();
        Log.d("Toast","onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        //Toast.makeText(this,"Resume",Toast.LENGTH_LONG).show();
        Log.d("Toast","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this,"Pause",Toast.LENGTH_LONG).show();
        Log.d("Toast","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();
        Log.d("Toast","onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(this,"Restart",Toast.LENGTH_LONG).show();
        Log.d("Toast","onRestart");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this,"Destroy",Toast.LENGTH_LONG).show();
        Log.d("Toast","onDestroy");

        AlertDialog.Builder alert=new AlertDialog.Builder(this);

        // pop's
        //icon
        //ttle
        //msg
        // Y(posativ) - N(nagative)
        // cancelable
        //netrual -cancle-
        //date piker

        // task  --> custom dialog , class with new XML ,and extend from dialog
    }
}