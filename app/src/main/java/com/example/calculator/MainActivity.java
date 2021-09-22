package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


     EditText nombre;
     TextView resultado;
     TextView moneda;
     Button btn_dollar;
     Button btn_euro;
     Button btn_dop;
     Button btn_yen;



    double numero1;
    float nun1;
    float nun2 ;
    String operador ="";
    float solucion;




  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.txt_nombre);
        resultado = findViewById(R.id.txt_Resultado);
        moneda = findViewById(R.id.moneda);

        btn_dollar = findViewById(R.id.button_dollar);
        btn_euro=findViewById((R.id.button_euro));
        btn_dop=findViewById(R.id.button_dop);
        btn_dop.setEnabled(false);
        moneda.setText("DOP");




    }



    public void SetUno(View view) {



            numero1 = Double.parseDouble(resultado.getText().toString());
            if(numero1==0){
                resultado.setText("1");

            }else{
                resultado.setText(resultado.getText() + "1");

            }


    }
    public void SetDos(View view) {
        numero1 = Double.parseDouble(resultado.getText().toString());
        if(numero1==0 ){
            resultado.setText("2");
        }else{
            resultado.setText(resultado.getText() + "2");
        }

    }
    public void SetTres(View view) {
        numero1 = Double.parseDouble(resultado.getText().toString());
        if(numero1==0){
            resultado.setText("3");
        }else{
            resultado.setText(resultado.getText() + "3");
        }

    }
    public void SetCuatro(View view) {

        numero1 = Double.parseDouble(resultado.getText().toString());
        if(numero1 ==0 ){
            resultado.setText("4");
        }else{
            resultado.setText(resultado.getText() + "4");
        }

    }
    public void SetCinco(View view) {
        numero1 = Double.parseDouble(resultado.getText().toString());
        if(numero1==0 ){
            resultado.setText("5");
        }else{
            resultado.setText(resultado.getText() + "5");
        }

    }
    public void SetSeix(View view) {
        numero1 = Double.parseDouble(resultado.getText().toString());
        if(numero1==0){
            resultado.setText("6");
        }else{
            resultado.setText(resultado.getText() + "6");
        }

    }
    public void Setsiete(View view) {
        numero1 = Double.parseDouble(resultado.getText().toString());
        if(numero1==0 ){
            resultado.setText("7");
        }else{
            resultado.setText(resultado.getText() + "7");
        }

    }
    public void SetOcho(View view) {
        numero1 = Double.parseDouble(resultado.getText().toString());
        if(numero1==0){
            resultado.setText("8");
        }else{
            resultado.setText(resultado.getText() + "8");
        }

    }
    public void SetNueve(View view) {
        numero1 = Double.parseDouble(resultado.getText().toString());
        if(numero1==0){
            resultado.setText("9");
        }else{
            resultado.setText(resultado.getText() + "9");
        }

    }
    public void SetCero (View view) {
        numero1 = Double.parseDouble(resultado.getText().toString());
        if(numero1==0 ){
            resultado.setText("0");
        }else{
            resultado.setText(resultado.getText() + "0");
        }

    }

    public void Limpiar(View view) {
        resultado.setText("0");
        nun1 = 0;
        nun2=0;
        operador = "";
    }

    public void sumar(View view) {


        nun1 =  Float.parseFloat(resultado.getText().toString());

        operador="+";
        resultado.setText("0");
    }

    public void igual(View view) {
        nun2 = Float.parseFloat(resultado.getText().toString());
        if(operador.equals("+")){
             solucion = nun1 + nun2;
            resultado.setText(solucion+"");
        }
        else if(operador.equals("*")){
             solucion = nun1 * nun2;
            resultado.setText(solucion+"");
        }
        else if(operador.equals("-")){
            solucion = nun1 - nun2;
            resultado.setText(solucion+"");
        }
        else if(operador.equals("/")){
            solucion = nun1 / nun2;
            resultado.setText(solucion+"");
        }
    }

    public void multiplicar(View view) {
        nun1 = Float.parseFloat(resultado.getText().toString());
        operador="*";
        resultado.setText("0");
    }

    public void restar(View view) {
        nun1 = Float.parseFloat(resultado.getText().toString());
        operador="-";
        resultado.setText("0");
    }

    public void dividir(View view) {
        nun1 = Float.parseFloat(resultado.getText().toString());
        operador="/";
        resultado.setText("0");
    }

    public void dollar(View view) {


        nun1 = Float.parseFloat(resultado.getText().toString());
        if (nun1 ==0){
            moneda.setText("$");

        }
        if(moneda.getText()=="$"){
            btn_dollar.setEnabled(false);
            btn_euro.setEnabled(true);
            btn_dop.setEnabled(true);

        }
         if(moneda.getText()=="€"){
            nun1 = Float.parseFloat(resultado.getText().toString());
            double dollars = nun1 * 1.18;
            moneda.setText("$");
            resultado.setText("");
            resultado.setText( dollars+"");
             btn_dollar.setEnabled(false);
             btn_euro.setEnabled(true);
             btn_dop.setEnabled(true);

        }
         else {
            nun1 = Float.parseFloat(resultado.getText().toString());
            double dollar = nun1 /57;
            moneda.setText("$");
            resultado.setText("");
            resultado.setText(dollar + "");
             btn_dollar.setEnabled(false);
             btn_euro.setEnabled(true);
             btn_dop.setEnabled(true);
        }

    }

    public void euro(View view) {


        nun1 = Float.parseFloat(resultado.getText().toString());
        if (nun1 ==0){
            moneda.setText("€");


        }if(moneda.getText()=="€"){
            btn_dollar.setEnabled(true);

            btn_dop.setEnabled(true);
            btn_euro.setEnabled(false);
        }
        if(moneda.getText()=="$"){
            nun1 = Float.parseFloat(resultado.getText().toString());
            double euro = nun1 * 0.85;
            moneda.setText("€");
            resultado.setText("");
            resultado.setText( euro+"");
            btn_euro.setEnabled(false);
            btn_dollar.setEnabled(true);
            btn_dop.setEnabled(true);

        }
        if(moneda.getText()=="DOP"){
            nun1 = Float.parseFloat(resultado.getText().toString());
            double euros = nun1 / 67;
            moneda.setText("€");
            resultado.setText("");
            resultado.setText( euros+"");
            btn_euro.setEnabled(false);
            btn_dollar.setEnabled(true);
            btn_dop.setEnabled(true);

        }


    }

    public void peso(View view) {

        nun1 = Float.parseFloat(resultado.getText().toString());
        if (nun1 ==0){
            moneda.setText("DOP");


        }
        if (moneda.getText() == "DOP") {
            btn_dop.setEnabled(false);
            btn_dollar.setEnabled(true);
            btn_euro.setEnabled(true);
        }
        if(moneda.getText()=="$"){
            nun1 = Float.parseFloat(resultado.getText().toString());
            double peso  = nun1 * 57;
            moneda.setText("DOP");
            resultado.setText("");
            resultado.setText( peso +"");
            btn_dop.setEnabled(false);
            btn_dollar.setEnabled(true);
            btn_euro.setEnabled(true);

        }
        if(moneda.getText()=="€"){
            nun1 = Float.parseFloat(resultado.getText().toString());
            double peso = nun1 * 68;
            moneda.setText("DOP");
            resultado.setText("");
            resultado.setText( peso+"");
            btn_dop.setEnabled(false);
            btn_dollar.setEnabled(true);
            btn_euro.setEnabled(true);

        }
    }

    public void yen(View view) {
        nun1 = Float.parseFloat(resultado.getText().toString());
        if (nun1 ==0){
            moneda.setText("YEN");


        }
        if (moneda.getText() == "YEN") {
            btn_dop.setEnabled(true );
            btn_dollar.setEnabled(true);
            btn_euro.setEnabled(true);
            btn_yen.setEnabled(false);
        }
        if(moneda.getText()=="$"){
            nun1 = Float.parseFloat(resultado.getText().toString());
            double peso  = nun1 * 0.0092;
            moneda.setText("YEN");
            resultado.setText("");
            resultado.setText( peso +"");
            btn_dop.setEnabled(false);
            btn_dollar.setEnabled(true);
            btn_euro.setEnabled(true);

        }
        if(moneda.getText()=="€") {
            nun1 = Float.parseFloat(resultado.getText().toString());
            double peso = nun1 * 0.0077;
            moneda.setText("YEN");
            resultado.setText("");
            resultado.setText(peso + "");
            btn_dop.setEnabled(false);
            btn_dollar.setEnabled(true);
            btn_euro.setEnabled(true);
        }
        if(moneda.getText()=="DOP") {
            nun1 = Float.parseFloat(resultado.getText().toString());
            double peso = nun1 * 0.52;
            moneda.setText("YEN");
            resultado.setText("");
            resultado.setText(peso + "");
            btn_dop.setEnabled(false);
            btn_dollar.setEnabled(true);
            btn_euro.setEnabled(true);
        }
    }


}