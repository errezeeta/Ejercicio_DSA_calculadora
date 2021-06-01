package com.example.ejerciciodsacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> listaNum = new ArrayList<>();
    List<Character> listaOp = new ArrayList<>();
    TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = this.findViewById(R.id.screen);
    }

    public void ClickIgual(View view) {
        int NumFinal = Integer.parseInt((String) screen.getText());
        int res= listaNum.get(0);
        //Para los numeros anteriores
        for (int i=1; i<listaNum.size(); i++) {
            if (listaOp.get(i-1)=='+')
                res= res+listaNum.get(i);
            if (listaOp.get(i-1)=='-')
                res= res-listaNum.get(i);
            if (listaOp.get(i-1)=='*')
                res= res * listaNum.get(i);
            if (listaOp.get(i-1)=='/')
                res= res / listaNum.get(i);
        }
        //Para el último numero
        if (listaOp.get(listaNum.size()-1)=='+')
            res= res+NumFinal;
        if (listaOp.get(listaNum.size()-1)=='-')
            res= res-NumFinal;
        if (listaOp.get(listaNum.size()-1)=='*')
            res= res*NumFinal;
        if (listaOp.get(listaNum.size()-1)=='/')
            res= res/NumFinal;
        String resultado= res +"";
        screen.setText(resultado);
        listaOp.clear();
        listaNum.clear();
    }

    public void Click8(View view) {
        if(screen.getText() == "")
        {
            screen.clearComposingText();
            screen.setText("8");
        }
        else
            screen.setText(screen.getText()+"8");
    }

    public void Click7(View view) {
        if(screen.getText() == "")
            screen.setText("7");
        else
            screen.setText(screen.getText()+"7");
    }

    public void Click9(View view) {
        if(screen.getText() == "")
            screen.setText("9");
        else
            screen.setText(screen.getText()+"9");
    }

    public void Click4(View view) {
        if(screen.getText() == "")
            screen.setText("4");
        else
            screen.setText(screen.getText()+"4");
    }

    public void Click5(View view) {
        if(screen.getText() == "")
            screen.setText("5");
        else
            screen.setText(screen.getText()+"5");
    }

    public void Click6(View view) {
        if(screen.getText() == "")
            screen.setText("6");
        else
            screen.setText(screen.getText()+"6");
    }

    public void Click1(View view) {
        if(screen.getText() == "")
            screen.setText("1");
        else
            screen.setText(screen.getText()+"1");
    }

    public void Click2(View view) {
        if(screen.getText() == "")
            screen.setText("2");
        else
            screen.setText(screen.getText()+"2");
    }

    public void Click3(View view) {
        if(screen.getText() == "")
            screen.setText("3");
        else
            screen.setText(screen.getText()+"3");
    }

    public void ClickMas(View view) {
        listaNum.add(Integer.parseInt((String) screen.getText()));
        screen.setText("");
        listaOp.add('+');
    }

    public void ClickDiv(View view) {
        listaNum.add(Integer.parseInt((String) screen.getText()));
        screen.setText("");
        listaOp.add('/');
    }

    public void ClickMultip(View view) {
        listaNum.add(Integer.parseInt((String) screen.getText()));
        screen.setText("");
        listaOp.add('*');
    }

    public void ClickMenos(View view) {
        listaNum.add(Integer.parseInt((String) screen.getText()));
        screen.setText("");
        listaOp.add('-');
    }
}