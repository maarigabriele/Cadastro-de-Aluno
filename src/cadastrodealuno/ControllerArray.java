/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodealuno;

import java.util.ArrayList;

/**
 *
 * @author Fabricio Junior
 */
public class ControllerArray {

    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private int index = 0;

    ///incremente os seguinte métodos que devem escolhe um aluno aleá
    public String proximo() {
        index++;
        return null;
    }

    public String anterior() {
        index--;
        return null;
    }

    public String ultimoCadastrado() {
        index = alunos.size() - 1;
        return null;
    }

    public boolean deleteAluno() {
        return true;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
