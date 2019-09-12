package com.example.exercicio2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ProdutoAdapter extends ArrayAdapter<Produto> {

    private int rId;

    public ProdutoAdapter(Context context, int resource, List<Produto> objects) {
        super(context, resource, objects);
        rId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View mView = convertView;
        Produto produto = getItem(position);

        if(mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId,null);
        }

        TextView textNome = mView.findViewById(R.id.textNome);
        TextView textQuantidade = mView.findViewById(R.id.textQuantidade);


        if (produto.getPrioridade() == "Alta"){
            textNome.setTextColor(Color.RED);
            textQuantidade.setTextColor(Color.RED);
        }

        textNome.setText(produto.getNome());
        textQuantidade.setText(produto.getQuantidade());


        return mView;
    }
}
