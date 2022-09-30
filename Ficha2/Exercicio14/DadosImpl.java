package entities;

import java.util.ArrayList;

public class DadosImpl implements Dados {
    private ArrayList<Transporte> lista = new ArrayList<>();

    @Override
    public void adicionar(Transporte t){
        lista.add(t);
    }

    @Override
    public void excluir(Transporte t){
        lista.remove(t);
    }
}
