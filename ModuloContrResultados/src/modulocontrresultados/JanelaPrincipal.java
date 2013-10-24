/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulocontrresultados;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    String url = "jdbc:derby://localhost:1527/controloResultados";
    Connection con;
    DefaultTableModel model;
    String sql;
    String NomeTabelaContrResultado;
    
    String comboTipoOP = ""; // guardar a opçao da ComboBox TIPO
    String comboSeccaoOP = ""; // guardar a opção da  comboBoc Opção (Controlo resultados)
    
    /* VARIAVEIS PARA O IDCONTROLORESULTADO, PARA INSERIR OS DADOS NA TABELA DAS NAO CONFORMIDADES */
    int idControloResultadosID = 0;
    
    
    /*  VARIAVEIS PARA ADICIONAR UMA NOVA NAO CONFORMIDADE A UM CONTROLO DE RESULTADOS  */
    int addNewNaoConformidadeIdFuncionario = 0;
    int addNewNaoConformidadeIDContrResultado = 0;
    
    
    
    
    /************************************************/
    
    public JanelaPrincipal() {
        initComponents();
                
        
        /*CARREGAMENTO DOS CAMPOS PARA A COMBO BOX */
    
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogNovoControloResultados = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxTipo = new javax.swing.JComboBox();
        jComboBoxOpcao = new javax.swing.JComboBox();
        jLabelTipo = new javax.swing.JLabel();
        jLabelOpcao = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jLabelFichaTecnica = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jComboBoxResultado = new javax.swing.JComboBox();
        jScrollPaneDescricao = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonInserir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelOutraOpcao = new javax.swing.JPanel();
        jLabelNomeOutraOpcao = new javax.swing.JLabel();
        jTextFieldOutraOpcao = new javax.swing.JTextField();
        jDateChooserControloResultados = new com.toedter.calendar.JDateChooser();
        jLabelFuncionario = new javax.swing.JLabel();
        jComboBoxFuncionario = new javax.swing.JComboBox();
        jDialogNaoConformidades = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabelDataNaoConformidade = new javax.swing.JLabel();
        jLabelOcorrecniaNaoConformidade = new javax.swing.JLabel();
        jLabelMedidaCorrectivaNaoConformidade = new javax.swing.JLabel();
        jScrollPaneOcorrencia = new javax.swing.JScrollPane();
        jTextAreaOcorrenciaNaoConformidade = new javax.swing.JTextArea();
        jScrollPanemedidaCorrectiva = new javax.swing.JScrollPane();
        jTextAreaMedidaCorrctivaNaoConformidade = new javax.swing.JTextArea();
        jButtonGravarNaoConformidade = new javax.swing.JButton();
        jButtonCancelarNaoConformidade = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxNaoConformidadeFuncionarioResponsav = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jDialogMedidasCorrectiva = new javax.swing.JDialog();
        jLabelMedidasCorrectivas = new javax.swing.JLabel();
        jPanelMedidasCorrectivas = new javax.swing.JPanel();
        jLabelDataMedidasCorrectivas = new javax.swing.JLabel();
        jLabelCorrectivaMedidasCorrectivas = new javax.swing.JLabel();
        jLabelObservacaoMedidasCorrectivas = new javax.swing.JLabel();
        jComboBoxCorrectivaMedidaCorrectiva = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservacaoMedidaCorrectiva = new javax.swing.JTextArea();
        jDateChooserMedidaCorrectiva = new com.toedter.calendar.JDateChooser();
        jButtonGravarMedidaCorrectiva = new javax.swing.JButton();
        jButtonCancelarMedidaCorrectiva = new javax.swing.JButton();
        jDialogConsultarControlos = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPaneConsultarControlos = new javax.swing.JScrollPane();
        jTableConsultarControlos = new javax.swing.JTable();
        jButtonFecharConsultaControlosResultados = new javax.swing.JButton();
        jButtonCriaNovoControloResultados = new javax.swing.JButton();
        jButtonVerNaoConformidade = new javax.swing.JButton();
        jComboBoxSeccao = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jDialogConsultaNaoConformidades = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabelNaoConformidades = new javax.swing.JLabel();
        jScrollPaneNaoConformidades = new javax.swing.JScrollPane();
        jTableNaoConformidades = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        jButtonAddNovaNaoConformidade = new javax.swing.JButton();
        jDialogConsultarMedidasCorrectivas = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabelConsultaMedidasCorrectivas = new javax.swing.JLabel();
        jScrollPaneConsultaMedidasCorrectivas = new javax.swing.JScrollPane();
        jTableConsultaMedidasCorrectivas = new javax.swing.JTable();
        jButtonVoltarMedidasCorrectivas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonNovoControlo = new javax.swing.JButton();
        jButtonControlos = new javax.swing.JButton();
        jButtonNaoConformidades = new javax.swing.JButton();
        jButtonConsultarMedidasCorrectivas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jDialogNovoControloResultados.setTitle("NOVO CONTROLO DE RESULTADOS");
        jDialogNovoControloResultados.setMinimumSize(new java.awt.Dimension(548, 740));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Controlo de Resultados"));

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- TIPO--", "INSECTOCACADORES", "EQUIPAMENTO", "ANALISE", "Outro", " " }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jComboBoxOpcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcaoActionPerformed(evt);
            }
        });

        jLabelTipo.setText("Tipo");

        jLabelOpcao.setText("Opção");

        jLabelData.setText("Data");

        jLabelResultado.setText("Resultado");

        jLabelFichaTecnica.setText("Ficha Tecnica");

        jLabelDescricao.setText("Descrição");

        jComboBoxResultado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "C", "NC" }));
        jComboBoxResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxResultadoActionPerformed(evt);
            }
        });

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPaneDescricao.setViewportView(jTextAreaDescricao);

        jLabel2.setText("C - Conforme | NC - Não Conforme");

        jLabel3.setText("UPLOAD");

        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelNomeOutraOpcao.setText("Nome");

        javax.swing.GroupLayout jPanelOutraOpcaoLayout = new javax.swing.GroupLayout(jPanelOutraOpcao);
        jPanelOutraOpcao.setLayout(jPanelOutraOpcaoLayout);
        jPanelOutraOpcaoLayout.setHorizontalGroup(
            jPanelOutraOpcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOutraOpcaoLayout.createSequentialGroup()
                .addComponent(jLabelNomeOutraOpcao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldOutraOpcao, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
        );
        jPanelOutraOpcaoLayout.setVerticalGroup(
            jPanelOutraOpcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOutraOpcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOutraOpcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeOutraOpcao)
                    .addComponent(jTextFieldOutraOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDateChooserControloResultados.setDateFormatString("yyyy-MM-dd");

        jLabelFuncionario.setText("Funcionario");

        jComboBoxFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelResultado)
                            .addComponent(jLabelFichaTecnica)
                            .addComponent(jLabelData)
                            .addComponent(jLabelDescricao))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButtonInserir)
                                        .addGap(60, 60, 60)
                                        .addComponent(jButtonCancelar))
                                    .addComponent(jLabel2)
                                    .addComponent(jDateChooserControloResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPaneDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipo)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelOutraOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelOpcao)
                            .addComponent(jComboBoxOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelFuncionario)
                    .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jLabelOpcao))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelOutraOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelData)
                    .addComponent(jDateChooserControloResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResultado)
                    .addComponent(jComboBoxResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFichaTecnica)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao)
                    .addComponent(jScrollPaneDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInserir)
                    .addComponent(jButtonCancelar))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jDialogNovoControloResultadosLayout = new javax.swing.GroupLayout(jDialogNovoControloResultados.getContentPane());
        jDialogNovoControloResultados.getContentPane().setLayout(jDialogNovoControloResultadosLayout);
        jDialogNovoControloResultadosLayout.setHorizontalGroup(
            jDialogNovoControloResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogNovoControloResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jDialogNovoControloResultadosLayout.setVerticalGroup(
            jDialogNovoControloResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogNovoControloResultadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jDialogNaoConformidades.setTitle("NOVA NÃO CONFORMIDADE");
        jDialogNaoConformidades.setMinimumSize(new java.awt.Dimension(435, 670));

        jPanel3.setMinimumSize(new java.awt.Dimension(200, 150));

        jLabelDataNaoConformidade.setText("Data");

        jLabelOcorrecniaNaoConformidade.setText("Ocorrencia");

        jLabelMedidaCorrectivaNaoConformidade.setText("Medida Correctiva");

        jTextAreaOcorrenciaNaoConformidade.setColumns(20);
        jTextAreaOcorrenciaNaoConformidade.setRows(5);
        jTextAreaOcorrenciaNaoConformidade.setPreferredSize(new java.awt.Dimension(164, 100));
        jScrollPaneOcorrencia.setViewportView(jTextAreaOcorrenciaNaoConformidade);

        jTextAreaMedidaCorrctivaNaoConformidade.setColumns(20);
        jTextAreaMedidaCorrctivaNaoConformidade.setRows(5);
        jScrollPanemedidaCorrectiva.setViewportView(jTextAreaMedidaCorrctivaNaoConformidade);

        jButtonGravarNaoConformidade.setText("Guardar");
        jButtonGravarNaoConformidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarNaoConformidadeActionPerformed(evt);
            }
        });

        jButtonCancelarNaoConformidade.setText("Cancelar");
        jButtonCancelarNaoConformidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarNaoConformidadeActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel6.setText("Funcionario Responsavel");

        jComboBoxNaoConformidadeFuncionarioResponsav.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPanemedidaCorrectiva, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelMedidaCorrectivaNaoConformidade))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jScrollPaneOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabelDataNaoConformidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelOcorrecniaNaoConformidade)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonGravarNaoConformidade)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonCancelarNaoConformidade))
                            .addComponent(jComboBoxNaoConformidadeFuncionarioResponsav, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDataNaoConformidade)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabelOcorrecniaNaoConformidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMedidaCorrectivaNaoConformidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanemedidaCorrectiva, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxNaoConformidadeFuncionarioResponsav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGravarNaoConformidade)
                    .addComponent(jButtonCancelarNaoConformidade))
                .addGap(67, 67, 67))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("NÃO CONFORMIDADE");

        javax.swing.GroupLayout jDialogNaoConformidadesLayout = new javax.swing.GroupLayout(jDialogNaoConformidades.getContentPane());
        jDialogNaoConformidades.getContentPane().setLayout(jDialogNaoConformidadesLayout);
        jDialogNaoConformidadesLayout.setHorizontalGroup(
            jDialogNaoConformidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogNaoConformidadesLayout.createSequentialGroup()
                .addGroup(jDialogNaoConformidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogNaoConformidadesLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel4))
                    .addGroup(jDialogNaoConformidadesLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jDialogNaoConformidadesLayout.setVerticalGroup(
            jDialogNaoConformidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogNaoConformidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jDialogMedidasCorrectiva.setTitle("NOVA MEDIDA CORRECTIVA");
        jDialogMedidasCorrectiva.setMinimumSize(new java.awt.Dimension(500, 600));

        jLabelMedidasCorrectivas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMedidasCorrectivas.setText("Medidas Correctivas");

        jLabelDataMedidasCorrectivas.setText("Data");

        jLabelCorrectivaMedidasCorrectivas.setText("Correctiva");

        jLabelObservacaoMedidasCorrectivas.setText("Observação");

        jComboBoxCorrectivaMedidaCorrectiva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Opção--", "Sim", "Não" }));
        jComboBoxCorrectivaMedidaCorrectiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCorrectivaMedidaCorrectivaActionPerformed(evt);
            }
        });

        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 150));

        jTextAreaObservacaoMedidaCorrectiva.setColumns(20);
        jTextAreaObservacaoMedidaCorrectiva.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservacaoMedidaCorrectiva);

        jButtonGravarMedidaCorrectiva.setText("Gravar");
        jButtonGravarMedidaCorrectiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarMedidaCorrectivaActionPerformed(evt);
            }
        });

        jButtonCancelarMedidaCorrectiva.setText("Cancelar");
        jButtonCancelarMedidaCorrectiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarMedidaCorrectivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMedidasCorrectivasLayout = new javax.swing.GroupLayout(jPanelMedidasCorrectivas);
        jPanelMedidasCorrectivas.setLayout(jPanelMedidasCorrectivasLayout);
        jPanelMedidasCorrectivasLayout.setHorizontalGroup(
            jPanelMedidasCorrectivasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedidasCorrectivasLayout.createSequentialGroup()
                .addGroup(jPanelMedidasCorrectivasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMedidasCorrectivasLayout.createSequentialGroup()
                        .addGroup(jPanelMedidasCorrectivasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMedidasCorrectivasLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabelObservacaoMedidasCorrectivas))
                            .addGroup(jPanelMedidasCorrectivasLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabelDataMedidasCorrectivas)))
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserMedidaCorrectiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMedidasCorrectivasLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabelCorrectivaMedidasCorrectivas)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCorrectivaMedidaCorrectiva, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMedidasCorrectivasLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanelMedidasCorrectivasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMedidasCorrectivasLayout.createSequentialGroup()
                                .addComponent(jButtonGravarMedidaCorrectiva)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonCancelarMedidaCorrectiva))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanelMedidasCorrectivasLayout.setVerticalGroup(
            jPanelMedidasCorrectivasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedidasCorrectivasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelMedidasCorrectivasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDataMedidasCorrectivas)
                    .addComponent(jDateChooserMedidaCorrectiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelMedidasCorrectivasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorrectivaMedidasCorrectivas)
                    .addComponent(jComboBoxCorrectivaMedidaCorrectiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelObservacaoMedidasCorrectivas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMedidasCorrectivasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGravarMedidaCorrectiva)
                    .addComponent(jButtonCancelarMedidaCorrectiva))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogMedidasCorrectivaLayout = new javax.swing.GroupLayout(jDialogMedidasCorrectiva.getContentPane());
        jDialogMedidasCorrectiva.getContentPane().setLayout(jDialogMedidasCorrectivaLayout);
        jDialogMedidasCorrectivaLayout.setHorizontalGroup(
            jDialogMedidasCorrectivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogMedidasCorrectivaLayout.createSequentialGroup()
                .addGroup(jDialogMedidasCorrectivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogMedidasCorrectivaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanelMedidasCorrectivas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogMedidasCorrectivaLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabelMedidasCorrectivas)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jDialogMedidasCorrectivaLayout.setVerticalGroup(
            jDialogMedidasCorrectivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogMedidasCorrectivaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelMedidasCorrectivas)
                .addGap(34, 34, 34)
                .addComponent(jPanelMedidasCorrectivas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jDialogConsultarControlos.setTitle("CONSULTAR CONTROLOS DE RESULTADOS");
        jDialogConsultarControlos.setMinimumSize(new java.awt.Dimension(1040, 492));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Consultar Controlos");

        jTableConsultarControlos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Funcionario", "Analise", "Equipamento", "Insectador", "Data", "Resultado", "Ficha Tecnica", "Descrição", "Outro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultarControlos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultarControlosMouseClicked(evt);
            }
        });
        jScrollPaneConsultarControlos.setViewportView(jTableConsultarControlos);

        jButtonFecharConsultaControlosResultados.setText("Cancelar");
        jButtonFecharConsultaControlosResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharConsultaControlosResultadosActionPerformed(evt);
            }
        });

        jButtonCriaNovoControloResultados.setText("Criar Novo");
        jButtonCriaNovoControloResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriaNovoControloResultadosActionPerformed(evt);
            }
        });

        jButtonVerNaoConformidade.setText("Ver Não Conformidade");
        jButtonVerNaoConformidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerNaoConformidadeActionPerformed(evt);
            }
        });

        jComboBoxSeccao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Sessão--", "Analises", "Equipamentos", "Insectadores", "Outros", " " }));
        jComboBoxSeccao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSeccaoActionPerformed(evt);
            }
        });

        jLabel7.setText("Secção");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneConsultarControlos)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonCriaNovoControloResultados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFecharConsultaControlosResultados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSeccao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVerNaoConformidade)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(397, 397, 397))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVerNaoConformidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxSeccao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneConsultarControlos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFecharConsultaControlosResultados)
                    .addComponent(jButtonCriaNovoControloResultados))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogConsultarControlosLayout = new javax.swing.GroupLayout(jDialogConsultarControlos.getContentPane());
        jDialogConsultarControlos.getContentPane().setLayout(jDialogConsultarControlosLayout);
        jDialogConsultarControlosLayout.setHorizontalGroup(
            jDialogConsultarControlosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarControlosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogConsultarControlosLayout.setVerticalGroup(
            jDialogConsultarControlosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarControlosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogConsultaNaoConformidades.setTitle("CONSULTAR NÃO CONFORMIDADES");
        jDialogConsultaNaoConformidades.setMinimumSize(new java.awt.Dimension(840, 375));

        jLabelNaoConformidades.setText("CONSULTA NAO CONFORMIDADES");

        jTableNaoConformidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cont Resulta", "Funcionario", "Data(Ñ Confor)", "Ocorrencia", "Medida Correct.", "Func. Responsav."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneNaoConformidades.setViewportView(jTableNaoConformidades);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonAddNovaNaoConformidade.setText("Nova Não Conformidade");
        jButtonAddNovaNaoConformidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNovaNaoConformidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneNaoConformidades, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabelNaoConformidades)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186)
                .addComponent(jButtonAddNovaNaoConformidade)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNaoConformidades)
                .addGap(39, 39, 39)
                .addComponent(jScrollPaneNaoConformidades, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonAddNovaNaoConformidade))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogConsultaNaoConformidadesLayout = new javax.swing.GroupLayout(jDialogConsultaNaoConformidades.getContentPane());
        jDialogConsultaNaoConformidades.getContentPane().setLayout(jDialogConsultaNaoConformidadesLayout);
        jDialogConsultaNaoConformidadesLayout.setHorizontalGroup(
            jDialogConsultaNaoConformidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultaNaoConformidadesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jDialogConsultaNaoConformidadesLayout.setVerticalGroup(
            jDialogConsultaNaoConformidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultaNaoConformidadesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogConsultarMedidasCorrectivas.setTitle("CONSULTAR MEDIDAS CORRECCTIVAS");
        jDialogConsultarMedidasCorrectivas.setMinimumSize(new java.awt.Dimension(740, 380));

        jLabelConsultaMedidasCorrectivas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelConsultaMedidasCorrectivas.setText("Consulta Medidas Correctivas");

        jTableConsultaMedidasCorrectivas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Funcionario", "Data", "Correctiva", "Observações"
            }
        ));
        jScrollPaneConsultaMedidasCorrectivas.setViewportView(jTableConsultaMedidasCorrectivas);

        jButtonVoltarMedidasCorrectivas.setText("Voltar");
        jButtonVoltarMedidasCorrectivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarMedidasCorrectivasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabelConsultaMedidasCorrectivas))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVoltarMedidasCorrectivas)
                            .addComponent(jScrollPaneConsultaMedidasCorrectivas, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConsultaMedidasCorrectivas)
                .addGap(31, 31, 31)
                .addComponent(jScrollPaneConsultaMedidasCorrectivas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVoltarMedidasCorrectivas)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogConsultarMedidasCorrectivasLayout = new javax.swing.GroupLayout(jDialogConsultarMedidasCorrectivas.getContentPane());
        jDialogConsultarMedidasCorrectivas.getContentPane().setLayout(jDialogConsultarMedidasCorrectivasLayout);
        jDialogConsultarMedidasCorrectivasLayout.setHorizontalGroup(
            jDialogConsultarMedidasCorrectivasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarMedidasCorrectivasLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogConsultarMedidasCorrectivasLayout.setVerticalGroup(
            jDialogConsultarMedidasCorrectivasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultarMedidasCorrectivasLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo Controlo Resultadosmo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Controlo de Resultados");

        jButtonNovoControlo.setText("Novo Controlo");
        jButtonNovoControlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoControloActionPerformed(evt);
            }
        });

        jButtonControlos.setText("Consultar Controlos");
        jButtonControlos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonControlosActionPerformed(evt);
            }
        });

        jButtonNaoConformidades.setText("Consultar Não Conformidades");
        jButtonNaoConformidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNaoConformidadesActionPerformed(evt);
            }
        });

        jButtonConsultarMedidasCorrectivas.setText("Consultar Medidas Correctivas");
        jButtonConsultarMedidasCorrectivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarMedidasCorrectivasActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButtonNovoControlo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonConsultarMedidasCorrectivas)
                            .addComponent(jButtonNaoConformidades)
                            .addComponent(jButtonControlos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoControlo)
                    .addComponent(jButtonControlos))
                .addGap(18, 18, 18)
                .addComponent(jButtonNaoConformidades)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonConsultarMedidasCorrectivas)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(15, 15, 15)
                        .addComponent(jButton2))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoControloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoControloActionPerformed
        
        //ABRIR JANELA ESCOLHE
        jDialogNovoControloResultados.setLocationRelativeTo(this);
        jDialogNovoControloResultados.setVisible(true);
        
        //ESCONDER PANEL "OUTRA OPÇAO NOME"
        jTextFieldOutraOpcao.setEnabled(false);
        
        //COMBOBOX FUNCIONARIO CARREGAR DADOS
        LerBDFuncionario();
      
        
    }//GEN-LAST:event_jButtonNovoControloActionPerformed

    private void jComboBoxResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxResultadoActionPerformed

    private void jButtonGravarNaoConformidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarNaoConformidadeActionPerformed
        // BOTAO GUARDAR E ABRIR JANELA DE MEDIDAS CORRECTIVAS
        //jDialogMedidasCorrectiva.setVisible(true);
       //GravarNaoConformidade(); 
       
       
       int resultNaoConformidade = JOptionPane.showConfirmDialog(jDialogNaoConformidades, "Deseja Abrir a Janela de Medidas Correctivas?", null, JOptionPane.YES_NO_OPTION);
        
        if (resultNaoConformidade == JOptionPane.YES_OPTION){
            GravarNaoConformidade();
            jDialogMedidasCorrectiva.setLocationRelativeTo(jDialogNaoConformidades);
            jDialogNaoConformidades.setVisible(false);
            jDialogMedidasCorrectiva.setVisible(true);
        } else if (resultNaoConformidade == JOptionPane.NO_OPTION){
            int resultNaoConformidadeGuardar = JOptionPane.showConfirmDialog(jDialogNaoConformidades, "Deseja Guardar os Dados e Voltar ao Menu Principal?", null, JOptionPane.YES_NO_OPTION);
            
            if (resultNaoConformidadeGuardar == JOptionPane.YES_OPTION){
                GravarNaoConformidade();
                jDialogNaoConformidades.setVisible(false);
            }
            
        }
       
       
    }//GEN-LAST:event_jButtonGravarNaoConformidadeActionPerformed

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
       //BOTAO INSERIR NOVA CONTROLO DE RESULTADOS
       InserirNovoControloResultados();     

        
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        //VERIFICAR QUAL A OPÇAO QUE ESTAMOS A SELECCIONAR
        comboTipoOP = jComboBoxTipo.getSelectedItem().toString();
             
        if (comboTipoOP.equals("Outro")){ 
            System.out.println("TIPO : " + comboTipoOP);
            //BLOQUEAR COMBOBOX OPÇAO
            jComboBoxOpcao.setEnabled(false);
            //MOSTRAR TEXTFIEL
            jTextFieldOutraOpcao.setEnabled(true);
        }else if (comboTipoOP.equals("INSECTOCACADORES")){
            //Select a tabela dos insectadores
            LerBDInsectadores();
            
        }else if (comboTipoOP.equals("EQUIPAMENTO")){
            LerBDEquipamento();
        }
       
        


    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jButtonControlosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonControlosActionPerformed
        // ABRIR JANELA DE CONSULTAS DE RESULTADOS DE CONTROLO
        LimpaTabelaConsultarControlos();
        LerBDControloResultados();
        
        jDialogConsultarControlos.setLocationRelativeTo(this);
        jDialogConsultarControlos.setVisible(true);
        
    }//GEN-LAST:event_jButtonControlosActionPerformed

    private void jButtonFecharConsultaControlosResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharConsultaControlosResultadosActionPerformed
        // FECHAR JANELA CONSULTAR RESULTADOS
        jDialogConsultarControlos.setVisible(false);
    }//GEN-LAST:event_jButtonFecharConsultaControlosResultadosActionPerformed

    private void jTableConsultarControlosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultarControlosMouseClicked
        // QUANDO CARREGAMOS NA TABELA
        LimpaTabelaConsultaNaoConformidades();
//        LerBDConsultaNaoConformidades();
                
        
    }//GEN-LAST:event_jTableConsultarControlosMouseClicked

    private void jButtonNaoConformidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNaoConformidadesActionPerformed
        // JANELA CONSULTAR NAO CONFORMIDADES
        LimpaTabelaConsultaNaoConformidades();
        LerBDNaoConformidades();
        jDialogConsultaNaoConformidades.setLocationRelativeTo(this);
        jDialogConsultaNaoConformidades.setVisible(true);
        //ESCONDER BOTAO ADICIONAR NOVO
        jButtonAddNovaNaoConformidade.setVisible(false);
        
        
    }//GEN-LAST:event_jButtonNaoConformidadesActionPerformed

    private void jButtonCriaNovoControloResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriaNovoControloResultadosActionPerformed
        // CRIAR NOVA CONTROLO DE RESULTADOS
        
        jDialogConsultarControlos.setVisible(false);
        jDialogNovoControloResultados.setLocationRelativeTo(this);
        jDialogNovoControloResultados.setVisible(true);
        
    }//GEN-LAST:event_jButtonCriaNovoControloResultadosActionPerformed

    private void jButtonVerNaoConformidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerNaoConformidadeActionPerformed
        // BOTAO PARA ABRIR O SELECCIONADA DA TABELA ( NAO CONFORMIDADES)
        int linha = jTableConsultarControlos.getSelectedRow();
        

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione a Linha do Controlo de Resulto ");
        } else {

            //DEVOLVE O NOME DO FUNCIONARIO
            String nomeFunc = (String) jTableConsultarControlos.getValueAt(linha, 0);
            //System.out.println("Nome: " + nomeFunc);

            String resultado = (String) jTableConsultarControlos.getValueAt(linha, 5);
           
            int idFuncionario = 0;
            
            
            //VERIFICAR SE A LINHA QUE ESTAMOS A SELECCINAR, O RESILTADO É
            // C OU NC
            if (resultado.equals("NC")) {

                jDialogNovoControloResultados.setVisible(false);
                jDialogConsultaNaoConformidades.setVisible(true);
                jDialogConsultaNaoConformidades.setLocationRelativeTo(this);

                //DEVOLVE O ID DO FUNCIONARIO
                idFuncionario = selectId("FUNCIONARIO", "Nome", nomeFunc, "IDFUNCIONARIO");
                //System.out.println("IDFUNCIONARIO TABELA -> " + idFuncionario);
               

                //DEVOLVE O IDCONTRESULTADO ONDE O FUNCIONARIO É = AO QUE VEM DE CIMA
                LimpaTabelaConsultaNaoConformidades();
                ConsultaBDNaoConformidadeSelect(idFuncionario);
            } else {
                JOptionPane.showMessageDialog(null, "Linha Selecciona não contem Nehuma Não Conformidade ! ");
            }

        }
    }//GEN-LAST:event_jButtonVerNaoConformidadeActionPerformed

    private void jComboBoxOpcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOpcaoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        //BOTAO FECHAR A JANELA CONTROLO DE RESULTADOS
        jDialogNovoControloResultados.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxCorrectivaMedidaCorrectivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCorrectivaMedidaCorrectivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCorrectivaMedidaCorrectivaActionPerformed

    private void jButtonGravarMedidaCorrectivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarMedidaCorrectivaActionPerformed
        // BOTAO GUARDAR MEDIDA CORRETIVas  
        
        int resultMedidaCorrectiva = JOptionPane.showConfirmDialog(jDialogMedidasCorrectiva, "Deseja Guardar os dados ?", null, JOptionPane.YES_NO_OPTION);
        
        if (resultMedidaCorrectiva == JOptionPane.YES_OPTION){
            GravarMedidaCorrectivas();
            jDialogMedidasCorrectiva.setVisible(false);
        } 
    }//GEN-LAST:event_jButtonGravarMedidaCorrectivaActionPerformed

    private void jButtonConsultarMedidasCorrectivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarMedidasCorrectivasActionPerformed
        // CONSULTAR MEDIDAS CORRECTIVAS
        LimpaTabelaConsultaMedidasCorrectivas();
       // LerBDConsultarMedidasCorrectivas();
        jDialogConsultarMedidasCorrectivas.setLocationRelativeTo(this);
        jDialogConsultarMedidasCorrectivas.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarMedidasCorrectivasActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // BOTAO VOLTAR
        jDialogConsultaNaoConformidades.setVisible(false);
        LimpaTabelaConsultaNaoConformidades();
        
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonVoltarMedidasCorrectivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarMedidasCorrectivasActionPerformed
        // BOTOA VOLTAR
        jDialogConsultarMedidasCorrectivas.setVisible(false);
        LimpaTabelaConsultaMedidasCorrectivas();
    }//GEN-LAST:event_jButtonVoltarMedidasCorrectivasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jDialogNaoConformidades.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jDialogMedidasCorrectiva.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxSeccaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSeccaoActionPerformed
        //QUAL A SESSAO QUE VAMOS CARREGAAR PARA  A TABELA
//        String comboPesquisa = jComboBoxSeccao.getSelectedItem().toString();
//        
//        if (comboPesquisa.equals("Analises")){
//            comboSeccaoOP = "Analises";
//            
//        }else if (comboPesquisa.equals("Equipamentos")){
//          comboSeccaoOP = "Equipamentos";
//            
//        }else if (comboPesquisa.equals("Insectadores")){
//           comboSeccaoOP = "Insectadores";
//            
//            
//        }else if (comboPesquisa.equals("Outros")){
//            comboSeccaoOP = "Outros";
//        }
//        
//        LimpaTabelaConsultarControlos();
//        LerBDControloResultados();

        
    }//GEN-LAST:event_jComboBoxSeccaoActionPerformed

    private void jButtonAddNovaNaoConformidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNovaNaoConformidadeActionPerformed
        // ADICIONAR NOVA NAO CONFORMIDADE AKELE CONTROLO RESULTADOS
            
        jDialogNaoConformidades.setVisible(true);
        
        //PARA ADICIONAR UMA NOVA NAO CONFORMIDADE NECESSITAMOS DE PASSAR OS CAMPOS "IDCONTRESULT" e "IDFUNCIONARIO"
        
        int funcionario = addNewNaoConformidadeIdFuncionario ;
        int controResult = idControloResultadosID;
        
        
        
        //ESCREVER
        System.out.println("CONTROLO RESULTADOS");
        System.out.println("FUNCIONARIO: " + funcionario);
        System.out.println("CONTRO RESULT: " + controResult);
        System.out.println("\n\n");
        
   
        
    }//GEN-LAST:event_jButtonAddNovaNaoConformidadeActionPerformed

    private void jButtonCancelarNaoConformidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarNaoConformidadeActionPerformed
        // BOTAO FECHAR JANELA NAO CONFORMIDADES
        jDialogNaoConformidades.setVisible(false);
        LimpaNaoConformidade();
    }//GEN-LAST:event_jButtonCancelarNaoConformidadeActionPerformed

    private void jButtonCancelarMedidaCorrectivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarMedidaCorrectivaActionPerformed
        //BOTAO FEXHAR JANELA MEDIDAS CORRECTIVAS
        jDialogMedidasCorrectiva.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarMedidaCorrectivaActionPerformed
 
     
    
    
    /* LER */ 
       
    private void LerBDControloResultados(){
     
        int idFuncionario = 0; 
        String nomeFuncionario ="";
        int idAnalise = 0;
        int idEquipamento = 0;
        int idInsectad = 0;
        String data = "";
        String resultado = "";
        String fichaTecnica = "";
        String descricao = "";
        String outro = "";
        
        model = (DefaultTableModel) jTableConsultarControlos.getModel();
        
        //Ligação BD
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
        }catch(ClassNotFoundException e){
           System.err.print("ClassNotFoundException: ");
           System.err.println(e.getMessage());
           System.out.println("O driver expecificado nao foi encontrado."); 
        }      
        
        try{
                     
            con = DriverManager.getConnection(url);
            String nomeTabela = "controloresultados";
            String sql = "select * from "+nomeTabela;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
           
            while(rs.next()){
                idFuncionario = rs.getInt("IDFUNCIONARIO");
                nomeFuncionario = selectString("FUNCIONARIO","IDFUNCIONARIO",idFuncionario,"NOME"); 
               
                idAnalise =  rs.getInt("IDANALISE");
                idEquipamento = rs.getInt("IDEQUIPAMENTO");
                idInsectad =  rs.getInt("IDINSECTOCACADORES");
                data = rs.getString("DATA");
                resultado = rs.getString("RESULTADO");
                fichaTecnica = rs.getString("FICHATECNICA");
                descricao = rs.getString("DESCRICAO");
                outro = rs.getString("outros");
                
                model.addRow(new Object[]{nomeFuncionario, idAnalise, idEquipamento, idInsectad, data, resultado, fichaTecnica, descricao, outro});
                                
            }
            
            st.close();
            con.close();
        }catch (SQLException ex){
            System.err.println("SQLException: " + ex.getMessage());
        }
    
    }
    
    private void LerBDNaoConformidades(){
        int idNaoConf = 0;
        int idContResultados = 0;
        int idFuncionario = 0;
        String dataNaoConform = "";
        String ocorrencia = "";
        String medidaCorrecti = "";
        int idFuncionarioResponsavelMedidaCorrectiva = 0;
        String NomeIdFuncionarioResponsavelMedidaCorrectiva = "";
        
        model = (DefaultTableModel) jTableNaoConformidades.getModel();
         
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
        }catch(ClassNotFoundException e){
           System.err.print("ClassNotFoundException: ");
           System.err.println(e.getMessage());
           System.out.println("O driver expecificado nao foi encontrado."); 
        }
        
         try{
                     
            con = DriverManager.getConnection(url);
            String nomeTabela = "NAOCONFORMIDADES";
            String sql = "select * from "+nomeTabela ;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
           
            while(rs.next()){
                idNaoConf = rs.getInt("IDNAOCONF");
                idContResultados = rs.getInt("IDCONTRESULTADOS");
                idFuncionario = rs.getInt("IDFUNCIONARIO");
                dataNaoConform = rs.getString("DATANAOCONFORMIDADE");
                ocorrencia = rs.getString("OCORRENCIA");
                medidaCorrecti = rs.getString("MEDIDACORRECTIVA");
                idFuncionarioResponsavelMedidaCorrectiva = rs.getInt("IDFUNCIONARIOMEDIDACORRECTIVA");
                NomeIdFuncionarioResponsavelMedidaCorrectiva = selectString("FUNCIONARIO","IDFUNCIONARIO",idFuncionarioResponsavelMedidaCorrectiva,"NOME"); 
                
                model.addRow(new Object[]{idNaoConf, idContResultados, idFuncionario, dataNaoConform, ocorrencia, medidaCorrecti, NomeIdFuncionarioResponsavelMedidaCorrectiva});
                                
            }
            
            st.close();
            con.close();
        }catch (SQLException ex){
            System.err.println("SQLException: " + ex.getMessage());
        }
        
    }
    
    private void LerBDEquipamento(){
     //LIMPAR A COMBO
        jComboBoxOpcao.removeAllItems();
        //CARREGAR DADOS
        Set<String> opcao = new HashSet<String>();
        
        try{
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//            Class.forName("com.mysql.jcbd.Driver");        
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        }catch(ClassNotFoundException e){
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try{
            con = DriverManager.getConnection(url);
            //            stmt = con.createStatement();
            String nomeTabela = "EQUIPAMENTO";
            String sql = "select * from " +nomeTabela; 
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                opcao.add(rs.getString("NOME"));
            }
            st.close();
            con.close();
            
        }catch(SQLException ex){
            System.err.println("SQLException: " + ex.getMessage()); 
        }
        
        jComboBoxOpcao.addItem("--Opção--");
        Iterator<String> it = opcao.iterator();
        while(it.hasNext()){
            jComboBoxOpcao.addItem(it.next());
        }
        
        
    }
    
    private void LerBDInsectadores(){
    //LIMPAR A COMBO
        jComboBoxOpcao.removeAllItems();
        //CARREGAR DADOS
        Set<String> opcao = new HashSet<String>();
        
        try{   
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        }catch(ClassNotFoundException e){
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try{
            con = DriverManager.getConnection(url);
            //            stmt = con.createStatement();
            String nomeTabela = "INSECTOCACADORES";
            String sql = "select * from " +nomeTabela; 
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                opcao.add(rs.getString("NOME"));
            }
            st.close();
            con.close();
            
        }catch(SQLException ex){
            System.err.println("SQLException: " + ex.getMessage()); 
        }
        
        jComboBoxOpcao.addItem("--Opção--");
        Iterator<String> it = opcao.iterator();
        while(it.hasNext()){
            jComboBoxOpcao.addItem(it.next());
        }
    }
    
    private void LerBDFuncionario(){
    //LIMPAR A COMBO
        jComboBoxFuncionario.removeAllItems();
        //CARREGAR DADOS
        Set<String> opcao = new HashSet<String>();
        
        try{   
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        }catch(ClassNotFoundException e){
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try{
            con = DriverManager.getConnection(url);
            //            stmt = con.createStatement();
            String nomeTabela = "FUNCIONARIO";
            String sql = "select * from " +nomeTabela; 
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                opcao.add(rs.getString("NOME"));
            }
            st.close();
            con.close();
            
        }catch(SQLException ex){
            System.err.println("SQLException: " + ex.getMessage()); 
        }
        
        jComboBoxFuncionario.addItem("--Funcionario--");
        Iterator<String> it = opcao.iterator();
        while(it.hasNext()){
            jComboBoxFuncionario.addItem(it.next());
        }
    
    }
     
    private void LerBDFuncionarioResponsavel(){
       //LIMPAR A COMBO
        jComboBoxNaoConformidadeFuncionarioResponsav.removeAllItems();
        //CARREGAR DADOS
        Set<String> opcao = new HashSet<String>();
        
        try{   
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        }catch(ClassNotFoundException e){
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        
        try{
            con = DriverManager.getConnection(url);
            //            stmt = con.createStatement();
            String nomeTabela = "FUNCIONARIO";
            String sql = "select * from " +nomeTabela; 
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                opcao.add(rs.getString("NOME"));
            }
            st.close();
            con.close();
            
        }catch(SQLException ex){
            System.err.println("SQLException: " + ex.getMessage()); 
        }
        
        jComboBoxNaoConformidadeFuncionarioResponsav.addItem("--Funcionario--");
        Iterator<String> it = opcao.iterator();
        while(it.hasNext()){
            jComboBoxNaoConformidadeFuncionarioResponsav.addItem(it.next());
        }
     
    }
      
    
    /* CONSULTAS */    
    
    //PREENCHER TABELAS COM DADOS SELECCIONADOS
    private void ConsultaBDNaoConformidadeSelect(int idFuncionarioSelecc ){
        int funcionario = idFuncionarioSelecc;
        
        int apagar = 0;
        int idFuncionario = 0;
        String dataNaoConform = "";
        String ocorrencia = "";
        String medidaCorrecti = "";
        String resultado = "NC";
        String nomefuncionario = "";
        
         model = (DefaultTableModel) jTableNaoConformidades.getModel();
                
        //Ligação BD
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
        }catch(ClassNotFoundException e){
           System.err.print("ClassNotFoundException: ");
           System.err.println(e.getMessage());
           System.out.println("O driver expecificado nao foi encontrado."); 
        }      
        
        try{         
            con = DriverManager.getConnection(url);
            String nomeTabela = "CONTROLORESULTADOS";
            String sql = "select * from "+nomeTabela+" where IDFUNCIONARIO="+funcionario +"and RESULTADO="+"'"+ resultado +"'";
            //String sql = "select * from "+nomeTabela+" where IDFUNCIONARIO="+funcionario;
            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
                   
            while(rs.next()){
                idControloResultadosID = rs.getInt("IDCONTRESULTADOS");
                System.out.println("IDCONTROLORESULTADO Pesquisar -> " + idControloResultadosID); 
                 //VARIVAEL GLOBAL
                addNewNaoConformidadeIdFuncionario = idFuncionario;              
                addNewNaoConformidadeIdFuncionario = funcionario;
                //ESCREVER NA TABELA A PESQUISA
                String nomeTabela2 = "NAOCONFORMIDADES";
                String sql2 = "select * from "+nomeTabela2+" where IDCONTRESULTADOS="+idControloResultadosID;
                PreparedStatement st2 = (PreparedStatement) con.prepareStatement(sql2);
                ResultSet rs2 = st2.executeQuery();
                
                while(rs2.next()){
                    apagar = rs2.getInt("IDCONTRESULTADOS");
                    idFuncionario = rs2.getInt("IDFUNCIONARIO");
                    nomefuncionario = selectString("FUNCIONARIO","IDFUNCIONARIO",idFuncionario,"NOME"); 
                    dataNaoConform = rs2.getString("DATANAOCONFORMIDADE");
                    ocorrencia = rs2.getString("OCORRENCIA");
                    medidaCorrecti = rs2.getString("MEDIDACORRECTIVA");
                    
                     model.addRow(new Object[]{apagar,nomefuncionario, dataNaoConform, ocorrencia, medidaCorrecti});
                }
                st2.close();               
            }
            
            st.close();
            con.close();
        }catch (SQLException ex){
            System.err.println("SQLException: " + ex.getMessage());
        } 
    }
        
    
    /* INSERIR */
    
    //COM A VERIFICAÇÃO DO C OU NC
    private void InserirNovoControloResultados(){
     
        
        String comboResultado = jComboBoxResultado.getSelectedItem().toString();
        //VERIFICAR QUAL O RESULTADO (NC) OU (C)
        if (comboResultado.equals("C")){
            //perguntar se quer mesmo gravar
            int resultGravar = JOptionPane.showConfirmDialog(jDialogNovoControloResultados, "Deseja Mesmo Gravar os dados ?", null, JOptionPane.YES_NO_OPTION);
            
            if(resultGravar == JOptionPane.YES_OPTION){
                //VAMOS GRAVAR OS DADOS
                GravarControloResultados();  
                jDialogNovoControloResultados.setVisible(false);
            }
        }else if (comboResultado.equals("NC")){
            int resultNCNaoConformidades = JOptionPane.showConfirmDialog(jDialogNovoControloResultados, "Deseja Abrir a Janela de Não Conformidades ?", null, JOptionPane.YES_NO_OPTION);
            
            if (resultNCNaoConformidades == JOptionPane.YES_OPTION){
                GravarControloResultados();
                jDialogNaoConformidades.setLocationRelativeTo(this);
                jDialogNaoConformidades.setVisible(true);
                jDialogNovoControloResultados.setVisible(false);
                LerBDFuncionarioResponsavel();
            }else if (resultNCNaoConformidades == JOptionPane.NO_OPTION){
                //perguntar se  quer gravar e voltar a pagi principal
                 int resultNCGravarVoltar = JOptionPane.showConfirmDialog(jDialogNovoControloResultados, "Deseja Gravar e Volta a Pagina Principal ?", null, JOptionPane.YES_NO_OPTION); 
                 
                 if (resultNCGravarVoltar == JOptionPane.YES_OPTION){
                     GravarControloResultados();
                     jDialogNovoControloResultados.setVisible(false);
                 }
                 
            }
                    
        }    
        
    }
    
    private void GravarControloResultados(){
    // INSERIR DADOS NA BASE 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        
        int idOpcaoEscolhida = 0;
        int idFuncionario = 0;
        int idAnalise = 0;
        int idEquipamento = 0;
        int idInsectocacadores = 0;
        String fichaTecnica = "" ;
        
        /*VERIFICAR SE O RESULTADO É C OU NC*/          
        String comboResultado = jComboBoxResultado.getSelectedItem().toString();
          
        
        //LER OS CAMPOS DA JANELAS
        String outro = jTextFieldOutraOpcao.getText();
        String data = (String) sdf.format(jDateChooserControloResultados.getDate());
        String resultado = comboResultado;
        String descricao = jTextAreaDescricao.getText();
    
        System.out.println("DATA: " + data);
      
        //VERIFICAR QUAL A OPÇAO DA COMBOBOX OPÇAO
        String comboOpcao = jComboBoxOpcao.getSelectedItem().toString();
        if (!comboOpcao.equals("--Opção--")){
          try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            } catch (ClassNotFoundException e) { //driver não encontrado
                System.err.print("ClassNotFoundException: ");
                System.err.println(e.getMessage());
                System.out.println("O driver expecificado nao foi encontrado.");
            }          
          try{
              con = DriverManager.getConnection(url);
              String nomeTabela = comboTipoOP; // nome da tabela
              String sql = "select * from " +nomeTabela+" where NOME='"+comboOpcao+"'";
              PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
              ResultSet rs = st.executeQuery();
              
              while (rs.next()){
                  idOpcaoEscolhida = rs.getInt("ID"+comboTipoOP); // ID + COMBOTIPO (nome da tabelas = ID + nome)
              }
              st.close();
              con.close();
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());        
          
            }   
        }  
        
        //VERIFICAR EM QUAL COLUNA VAMOS INSERIR A OPÇAO
        if (comboTipoOP.equals("INSECTOCACADORES")){
            idInsectocacadores = idOpcaoEscolhida;
            idEquipamento = 0;
            idAnalise = 0;
        }else if (comboTipoOP.equals("EQUIPAMENTO")){
            idInsectocacadores = 0;
            idEquipamento = idOpcaoEscolhida;
            idAnalise = 0;
        }else if (comboTipoOP.equals("ANALISE")){
            idInsectocacadores = 0;
            idEquipamento = 0;
            idAnalise = idOpcaoEscolhida;
        }else{
            //ker dizer ke tenho a opçao OUTRA
            idInsectocacadores = 0;
            idEquipamento = 0;
            idAnalise = 0;
            }
    
        
        //VERIFICAR QUAL O FUNCIONARIO
        String comboFuncio = jComboBoxFuncionario.getSelectedItem().toString();
        if (!comboFuncio.equals("--Funcionario--")){
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            } catch (ClassNotFoundException e) { //driver não encontrado
                System.err.print("ClassNotFoundException: ");
                System.err.println(e.getMessage());
                System.out.println("O driver expecificado nao foi encontrado.");
            }        
            
            try{
                con = DriverManager.getConnection(url);
                String nomeTabela = "FUNCIONARIO";
                String sql = "select * from "+nomeTabela+" where NOME='"+comboFuncio+"'";
                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                
                while(rs.next()){
                    idFuncionario = rs.getInt("IDFUNCIONARIO");
                }
                st.close();
                con.close();
            }catch (SQLException ex){
                 System.err.println("SQLException: " + ex.getMessage());
            }
        
        }
        
        
       //dados inseridos a manualmente
//        idFuncionario = 1;
//        idAnalise = 0;
//        idEquipamento = 2;
//        idInsectocacadores = 0;
//        data = "203-10-22";
//        resultado = "C";
//        fichaTecnica = "";
//        descricao =  "Descrição ";
//        outro = "";
        
        
        //LIGAÇAO PARA GRAVAR NA BASE DE DADOS
         try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            } catch (ClassNotFoundException e) { //driver não encontrado
                System.err.print("ClassNotFoundException: ");
                System.err.println(e.getMessage());
                System.out.println("O driver expecificado nao foi encontrado.");
            }
            try {
                con = DriverManager.getConnection(url);
                String nomeTabela = "CONTROLORESULTADOS";
                sql = "insert into " + nomeTabela+ "(IDFUNCIONARIO,IDANALISE,IDEQUIPAMENTO,IDINSECTOCACADORES,DATA,RESULTADO,FICHATECNICA,DESCRICAO,OUTROS)"
+ " values (" + idFuncionario + "," + idAnalise + "," + idEquipamento + "," + idInsectocacadores + "," + "'" + data + "'" + "," + "'" + resultado + "'" + "," + "'"+ fichaTecnica +"'"+ "," + "'" + descricao + "'" + "," + "'"+ outro + "'"  + ")";

                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                st.executeUpdate();
                 System.out.println("chegou");
                st.close();
                con.close();
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            }
          
  
          // ESCREVER CAMPOS NA CONSOLA
//            System.out.println("\n\n**INSERÇÃO DE DADOS");
//            System.out.println("FUNCIONARIO: " + idFuncionario); 
//            System.out.println("ANALISE: " + idAnalise);
//            System.out.println("EQUIPAMENTO: " + idEquipamento); 
//            System.out.println("INSECTICADO: " + idInsectocacadores);
//            System.out.println("DATA: " + data);
//            System.out.println("RESULTADO: " + resultado);
//            System.out.println("FICHA TEC: " + fichaTecnica); 
//            System.out.println("DESCRICAO: " + descricao);
//            System.out.println("OUTRO: " + outro );  
////              
//            System.out.println("/n/n");
//            System.out.println("TIPO: " + comboTipoOP);
//            System.out.println("OPÇCAO: " + comboOpcao);
//            System.out.println("IDENCONTR: " + idOpcaoEscolhida);
            
        
       // System.out.println("comboResultado : " + comboResultado); 
        
    }
       
    private void GravarNaoConformidade(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        
        int idConsResultados = 1;
        int idFuncionario = 0;
        String data = (String) sdf.format(jDateChooserControloResultados.getDate());
        String ocorrecia = jTextAreaOcorrenciaNaoConformidade.getText();
        String medidaCorrectiva = jTextAreaMedidaCorrctivaNaoConformidade.getText();
        int idFuncResponsavMedidCorrectiva = 0;
       

        
        //
        idConsResultados = addNewNaoConformidadeIDContrResultado;
        idFuncionario = addNewNaoConformidadeIdFuncionario;
        
        
       
        
        //VERIFICAR QUAL O FUNCIONARIO RESPOSAVEL PELA MEDIDA CORRECTIVA
        String comboFuncio = jComboBoxNaoConformidadeFuncionarioResponsav.getSelectedItem().toString();
        if (!comboFuncio.equals("--Funcionario--")){
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            } catch (ClassNotFoundException e) { //driver não encontrado
                System.err.print("ClassNotFoundException: ");
                System.err.println(e.getMessage());
                System.out.println("O driver expecificado nao foi encontrado.");
            }        
            
            try{
                con = DriverManager.getConnection(url);
                String nomeTabela = "FUNCIONARIO";
                String sql = "select * from "+nomeTabela+" where NOME='"+comboFuncio+"'";
                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                
                while(rs.next()){
                    idFuncResponsavMedidCorrectiva = rs.getInt("IDFUNCIONARIO");
                }
                st.close();
                con.close();
            }catch (SQLException ex){
                 System.err.println("SQLException: " + ex.getMessage());
            }
        
        }
        
        // DADOS FICTICIOS
        idFuncResponsavMedidCorrectiva = 1; 
        idConsResultados = 1;
        
        //LIGAÇAO PARA GRAVAR NA BASE DE DADOS
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "NAOCONFORMIDADES";
            sql = "insert into " + nomeTabela + "(IDCONTRESULTADOS,IDFUNCIONARIO, DATANAOCONFORMIDADE, OCORRENCIA, MEDIDACORRECTIVA, IDFUNCIONARIOMEDIDACORRECTIVA)"
                    + " values ("+idConsResultados + "," +idFuncionario+ "," + "'" +data+ "'" + "," + "'"+ocorrecia+ "'" + "," + "'" + medidaCorrectiva+"'" + "," +idFuncResponsavMedidCorrectiva   +")";

            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            st.executeUpdate();
          
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        
        System.out.println("\n\n**DADOS DA NAO CONFORMIDADE");
        System.out.println("IdContrResultados " + idConsResultados);
        System.out.println("IdFuncionario: " + idFuncionario);
        System.out.println("Data : " + data);
        System.out.println("OCOORENCIA : " + ocorrecia);
        System.out.println("MEDIDA : " + medidaCorrectiva);
        System.out.println("Funci Responsa: " + idFuncResponsavMedidCorrectiva);
       
    }
    
    private void GravarMedidaCorrectivas(){
         
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
         
         //DADOS A LER DA JANELA
         int idFuncionarioMedCorrect = 1;
         String dataMedCorrect = sdf.format(jDateChooserMedidaCorrectiva.getDate());
         int correctiva = 3;
         String observacaoMedCorrect = jTextAreaObservacaoMedidaCorrectiva.getText();
         
        
         //VERIFICAR O VALOR DA COMBOBOX RESULTADO 
         String comboResultado = jComboBoxCorrectivaMedidaCorrectiva.getSelectedItem().toString();
         
         if (!comboResultado.equals("--Opção--")){
             
             if (comboResultado.equals("Sim")){
                 correctiva = 0;
             } else if (comboResultado.equals("Não")){
                 correctiva = 1;
             }
         }
         
      
         System.out.println("correctiva: " + correctiva);
        System.out.println("DATA: " + dataMedCorrect);

         try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) { //driver não encontrado
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
            System.out.println("O driver expecificado nao foi encontrado.");
        }
        try {
            con = DriverManager.getConnection(url);
            String nomeTabela = "NAOCONFORMIDADES";
            sql = "insert into " + nomeTabela + "(DATAMEDIDACORRECTIVA, CORRECTIVA, OBSERVACAOMEDIDACORRECTIVA)"
                    + " values ("+ "'" + dataMedCorrect + "'" + "," + correctiva + "," + "'" + observacaoMedCorrect + "'"   +")";

            PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
            st.executeUpdate();
           
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
         
         
         
         
    }
    
    
    /*LIMPAR*/
    
    private void LimpaTabelaConsultarControlos(){
        DefaultTableModel model = (DefaultTableModel) jTableConsultarControlos.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++) {
            model.removeRow(0);
        }
    }
    
    private void LimpaTabelaConsultaNaoConformidades(){
        DefaultTableModel model = (DefaultTableModel) jTableNaoConformidades.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++) {
            model.removeRow(0);
        }
    }
    
    private void LimpaTabelaConsultaMedidasCorrectivas(){
      DefaultTableModel model = (DefaultTableModel) jTableConsultaMedidasCorrectivas.getModel();
        int linhas = model.getRowCount();
        
        for (int i = 0; i < linhas; i++) {
            model.removeRow(0);
        }
    }
    
    private void LimpaNaoConformidade (){
        
        jTextAreaOcorrenciaNaoConformidade.setText("");
        jTextAreaMedidaCorrctivaNaoConformidade.setText("");
        
    }
       
    
    /*FUNÇAO PARA LER OS CAMPO DE UMA TABELAS*/
    
    private int selectId(String tab, String col, String cam, String colId){
        int resultId = 0;
        String tabela = tab;
        String coluna = col;
        String campo = cam;
        String colunaId = colId;
        
        try {
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//            Class.forName("com.mysql.jcbd.Driver");
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            } catch (ClassNotFoundException e) { //driver não encontrado
                System.err.print("ClassNotFoundException: ");
                System.err.println(e.getMessage());
                System.out.println("O driver expecificado nao foi encontrado.");
            }                
            try {
                con = DriverManager.getConnection(url);
                sql = "select * from "+ tabela+ " where "+coluna+"='"+campo+"'";
                
                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    resultId = rs.getInt(colunaId);
                }
                st.close();
                con.close();
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            }
        return resultId;
    }
     
    private String selectString(String tab, String col, int cam, String colNome){
        String resultString = "";
        String tabela = tab;
        String coluna = col;
        int campo = cam;
        String colunaNome = colNome;
        
        try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            } catch (ClassNotFoundException e) { //driver não encontrado
                System.err.print("ClassNotFoundException: ");
                System.err.println(e.getMessage());
                System.out.println("O driver expecificado nao foi encontrado.");
            }                
            try {
                con = DriverManager.getConnection(url);
                sql = "select * from "+ tabela+ " where "+coluna+"="+campo+" ";
                
                PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    resultString = rs.getString(colunaNome);
                }
                st.close();
                con.close();
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
            }
            
        return resultString;
    }
    
    
    /* CARREGAR COMBOBOX*/
    
   
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAddNovaNaoConformidade;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCancelarMedidaCorrectiva;
    private javax.swing.JButton jButtonCancelarNaoConformidade;
    private javax.swing.JButton jButtonConsultarMedidasCorrectivas;
    private javax.swing.JButton jButtonControlos;
    private javax.swing.JButton jButtonCriaNovoControloResultados;
    private javax.swing.JButton jButtonFecharConsultaControlosResultados;
    private javax.swing.JButton jButtonGravarMedidaCorrectiva;
    private javax.swing.JButton jButtonGravarNaoConformidade;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonNaoConformidades;
    private javax.swing.JButton jButtonNovoControlo;
    private javax.swing.JButton jButtonVerNaoConformidade;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JButton jButtonVoltarMedidasCorrectivas;
    private javax.swing.JComboBox jComboBoxCorrectivaMedidaCorrectiva;
    private javax.swing.JComboBox jComboBoxFuncionario;
    private javax.swing.JComboBox jComboBoxNaoConformidadeFuncionarioResponsav;
    private javax.swing.JComboBox jComboBoxOpcao;
    private javax.swing.JComboBox jComboBoxResultado;
    private javax.swing.JComboBox jComboBoxSeccao;
    private javax.swing.JComboBox jComboBoxTipo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooserControloResultados;
    private com.toedter.calendar.JDateChooser jDateChooserMedidaCorrectiva;
    private javax.swing.JDialog jDialogConsultaNaoConformidades;
    private javax.swing.JDialog jDialogConsultarControlos;
    private javax.swing.JDialog jDialogConsultarMedidasCorrectivas;
    private javax.swing.JDialog jDialogMedidasCorrectiva;
    private javax.swing.JDialog jDialogNaoConformidades;
    private javax.swing.JDialog jDialogNovoControloResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelConsultaMedidasCorrectivas;
    private javax.swing.JLabel jLabelCorrectivaMedidasCorrectivas;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDataMedidasCorrectivas;
    private javax.swing.JLabel jLabelDataNaoConformidade;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelFichaTecnica;
    private javax.swing.JLabel jLabelFuncionario;
    private javax.swing.JLabel jLabelMedidaCorrectivaNaoConformidade;
    private javax.swing.JLabel jLabelMedidasCorrectivas;
    private javax.swing.JLabel jLabelNaoConformidades;
    private javax.swing.JLabel jLabelNomeOutraOpcao;
    private javax.swing.JLabel jLabelObservacaoMedidasCorrectivas;
    private javax.swing.JLabel jLabelOcorrecniaNaoConformidade;
    private javax.swing.JLabel jLabelOpcao;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelMedidasCorrectivas;
    private javax.swing.JPanel jPanelOutraOpcao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneConsultaMedidasCorrectivas;
    private javax.swing.JScrollPane jScrollPaneConsultarControlos;
    private javax.swing.JScrollPane jScrollPaneDescricao;
    private javax.swing.JScrollPane jScrollPaneNaoConformidades;
    private javax.swing.JScrollPane jScrollPaneOcorrencia;
    private javax.swing.JScrollPane jScrollPanemedidaCorrectiva;
    private javax.swing.JTable jTableConsultaMedidasCorrectivas;
    private javax.swing.JTable jTableConsultarControlos;
    private javax.swing.JTable jTableNaoConformidades;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextArea jTextAreaMedidaCorrctivaNaoConformidade;
    private javax.swing.JTextArea jTextAreaObservacaoMedidaCorrectiva;
    private javax.swing.JTextArea jTextAreaOcorrenciaNaoConformidade;
    private javax.swing.JTextField jTextFieldOutraOpcao;
    // End of variables declaration//GEN-END:variables
}
