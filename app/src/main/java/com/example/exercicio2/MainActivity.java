package com.example.exercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editNome, editQuantidade;
    private CheckBox checkbox_alta;
    private Spinner unidade_array;
    private ListView listProdutos;
    private List<Produto> produtos;
    private ArrayAdapter adapter;
    public String statusPrio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox_alta = findViewById(R.id.checkbox_alta);
        editNome = findViewById(R.id.editNome);
        editQuantidade = findViewById(R.id.editQuantidade);
        listProdutos = findViewById(R.id.listProdutos);
        unidade_array = findViewById(R.id.unidade_array);

        checkbox_alta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b){
                    statusPrio = "Alta";
                }

            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();

        produtos = new ArrayList<>();
        adapter = new ProdutoAdapter(getApplicationContext(),R.layout.list_item,produtos);
        listProdutos.setAdapter(adapter);
    }



    public void adicionarProduto(View view) {

        String nome = editNome.getText().toString();
        String quant = editQuantidade.getText().toString();
        String prioridade = statusPrio;
        String quantUni = quant + " " + unidade_array.getSelectedItem().toString();


        Produto produto = new Produto(nome,quantUni,prioridade);

        produtos.add(produto);

        adapter.notifyDataSetChanged();
    }
}
