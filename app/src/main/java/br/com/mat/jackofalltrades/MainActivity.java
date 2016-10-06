package br.com.mat.jackofalltrades;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.databinding.tool.Binding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.mat.jackofalltrades.Adapter.JoatAdapter;
import br.com.mat.jackofalltrades.Interfaces.JoatObjectInterface;
import br.com.mat.jackofalltrades.Objects.JoatObject;
import br.com.mat.jackofalltrades.Objects.JogoVO;
import br.com.mat.jackofalltrades.Objects.PessoaVO;
import br.com.mat.jackofalltrades.Objects.TestObject;
import br.com.mat.jackofalltrades.databinding.ActivityMainBinding;
import br.com.mat.jackofalltrades.databinding.RowJogoBinding;
import br.com.mat.jackofalltrades.databinding.RowPessoaBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Binding bin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        List lista1 = new ArrayList();
        RowPessoaBinding pessoaBinding = DataBindingUtil.inflate(getLayoutInflater(),R.layout.row_pessoa,null,false);
        lista1.add(new JoatObject(pessoaBinding,BR.pessoaVO,new PessoaVO("Matheus", "sem Telefone")));
        RowJogoBinding jogoBinding = DataBindingUtil.inflate(getLayoutInflater(),R.layout.row_jogo,null,false);
        lista1.add(new JoatObject(jogoBinding,BR.jogoVO,new JogoVO("WoW", "MMORPG")));
        JoatAdapter adapter = new JoatAdapter();
        binding.mainListView.setAdapter(adapter);
        adapter.setData(lista1);



    }
}
