//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Aluno aluno1 = new Aluno("Gabriel", 20, "Engenharia", 3);
    aluno1.matricular();
    aluno1.pagarBoleto();

    Professor prof1 = new Professor("Carlos", 45);
    prof1.lancarNota();

}
