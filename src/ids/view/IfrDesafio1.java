/*
Dado uma palavra qualquer p, construa um algoritmo que calcule a pontuação da palavra 
de acordo com a pontuação informada na tabela abaixo:

        LETRA VALOR

    A, E, I, O, U, L, N, R, S, T     1
    D, G                             2
    B, C, M, P                       3
    F, H, V, W, Y                    4
    K                                5
    J, X                             8
    Q, Z                             10

Por exemplo, se a palavra “desafio” for digitada, a pontuação esperada será 11:
D   E   S   A   F   I   O
2 + 1 + 1 + 1 + 4 + 1 + 1 = 11
 */
package ids.view;

import javax.swing.JOptionPane;


/**
 *
 * @author Giovane
 */
public class IfrDesafio1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrDesafio1
     */
    public IfrDesafio1() {
        initComponents();
        //Insere uma tooltip/dica para o usuário
        tfPalavra.setToolTipText("Digite uma palavra ou caractere.");
    }

    //Função calcular pontuação recebe uma string e retorna um inteiro
    private int calcularPontuacao(String p) {
        //Variável pontos será utilizada para armazenar o valor da pontuação
        int pontos = 0;
        
        //Variável alerta será utilizada para armazenar a quantidade de caracteres não condizentes 
        //nos cases do switch para alertar o usuário que seu valor não será calculado
        int alerta = 0;
        
        String calculo = "";
        
        //Loop/laço for utilizado para percorrer a string recebida
        for (int i = 0; i < p.length(); i++) {
            
            //switch recebe a string transformada para letras maiúsculas e
            //busca na posição i o valor do caractere
            //switch utilizado para determinar o valor do caractere e atribuir pontuação a variavel pontos
            switch(p.toUpperCase().charAt(i)){
                case 'A':{
                    pontos += 1;
                    break;
                }
                case 'E':{
                    pontos += 1;
                    break;
                }
                case 'I':{
                    pontos += 1;
                    break;
                }
                case 'O':{
                    pontos += 1;
                    break;
                }
                case 'U':{
                    pontos += 1;
                    break;
                }
                case 'L':{
                    pontos += 1;
                    break;
                }
                case 'N':{
                    pontos += 1;
                    break;
                }
                case 'R':{
                    pontos += 1;
                    break;
                }
                case 'S':{
                    pontos += 1;
                    break;
                }
                case 'T':{
                    pontos += 1;
                    break;
                }
                case 'D':{
                    pontos += 2;
                    break;
                }
                case 'G':{
                    pontos += 2;
                    break;
                }
                case 'B':{
                    pontos += 3;
                    break;
                }
                case 'C':{
                    pontos += 3;
                    break;
                }
                case 'M':{
                    pontos += 3;
                    break;
                }
                case 'P':{
                    pontos += 3;
                    break;
                }
                case 'F':{
                    pontos += 4;
                    break;
                }
                case 'H':{
                    pontos += 4;
                    break;
                }
                case 'V':{
                    pontos += 4;
                    break;
                }
                case 'W':{
                    pontos += 4;
                    break;
                }
                case 'Y':{
                    pontos += 4;
                    break;
                }
                case 'K':{
                    pontos += 5;
                    break;
                }
                case 'J':{
                    pontos += 8;
                    break;
                }
                case 'X':{
                    pontos += 8;
                    break;
                }
                case 'Q':{
                    pontos += 10;
                    break;
                }
                case 'Z':{
                    pontos += 10;
                    break;
                }
                //Switch permite tratar caracteres não condizentes com os valores sem código extra
                default:{    
                    alerta++;
                    break;
                }
            }
        }
        
        //Se o número de alertas de caracteres não condizentes com os cases do switch for maior que 0 dispara o alerta ao usuário
        if(alerta > 0){
            JOptionPane.showMessageDialog(this, "Apenas as letras serão calculadas.", "Aviso.", JOptionPane.ERROR_MESSAGE);
        }
        
        //Retorna o inteiro com os pontos
        return pontos;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPalavra = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        lbResultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Desafio 1");

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        lbResultado.setText("Resultado:");

        jLabel2.setText("Informe uma palavra:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPalavra, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btCalcular)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbResultado)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lbResultado)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        // Texto digitado no campo de texto é colocado na string p
        String p = tfPalavra.getText();
        
        //Se a string contendo o texto do campo de texto palavra estiver vazio o usuário sera alertado
        if(p.isEmpty()){
            JOptionPane.showMessageDialog(this, "Informe uma palavra ou caractere.", "Campo vazio.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
           
        //O label resultado tem seu texto alterado
        //Para o resultado da função calcularPontuacao que recebe o argumento string p
        //O resultado retornado é um inteiro que é transformado em string para colocar no label
        lbResultado.setText("Resultado: " + String.valueOf(calcularPontuacao(p)));
    }//GEN-LAST:event_btCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JTextField tfPalavra;
    // End of variables declaration//GEN-END:variables

    
}
