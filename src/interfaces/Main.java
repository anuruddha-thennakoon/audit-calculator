/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ANURUDDHA
 */
public class Main extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("00.00");

    /**
     * Creates new form NewJFrame
     */
    public Main() {
        initComponents();
    }

    void calTrialbalance() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            double c = 0;
            double d = 0;

            if (!(jTsales_d.getText().equals("00.00")) || !(jTsales_c.getText().equals("00.00"))) {
                if (jTsales_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLsales.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTsales_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTsales_c.getText().toString().trim());
                } else if (jTsales_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLsales.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTsales_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTsales_d.getText().toString().trim());
                }
            }

            if (!(jTpurchase_d.getText().equals("00.00")) || !(jTpurchase_c.getText().equals("00.00"))) {
                if (jTpurchase_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLpurchase.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTpurchase_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTpurchase_c.getText().toString().trim());
                } else if (jTpurchase_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLpurchase.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTpurchase_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTpurchase_d.getText().toString().trim());
                }
            }

            if (!(jTsalary_d.getText().equals("00.00")) || !(jTsalary_c.getText().equals("00.00"))) {
                if (jTsalary_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLsalary.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTsalary_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTsalary_c.getText().toString().trim());
                } else if (jTsalary_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLsalary.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTsalary_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTsalary_d.getText().toString().trim());
                }
            }

            if (!(jTepf_d.getText().equals("00.00")) || !(jTepf_c.getText().equals("00.00"))) {
                if (jTepf_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLepf.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTepf_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTepf_c.getText().toString().trim());
                } else if (jTepf_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLepf.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTepf_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTepf_d.getText().toString().trim());
                }
            }

            if (!(jTetf_d.getText().equals("00.00")) || !(jTetf_c.getText().equals("00.00"))) {
                if (jTetf_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLetf.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTetf_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTetf_c.getText().toString().trim());
                } else if (jTetf_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLetf.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTetf_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTetf_d.getText().toString().trim());
                }
            }

            if (!(jTelectricity_d.getText().equals("00.00")) || !(jTelectricity_c.getText().equals("00.00"))) {
                if (jTelectricity_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLelectrcity.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTelectricity_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTelectricity_c.getText().toString().trim());
                } else if (jTelectricity_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLelectrcity.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTelectricity_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTelectricity_d.getText().toString().trim());
                }
            }

            if (!(jTwater_d.getText().equals("00.00")) || !(jTwater_c.getText().equals("00.00"))) {
                if (jTwater_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLwater.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTwater_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTwater_c.getText().toString().trim());
                } else if (jTwater_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLwater.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTwater_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTwater_d.getText().toString().trim());
                }
            }

            if (!(jTtelephone_d.getText().equals("00.00")) || !(jTtelephone_c.getText().equals("00.00"))) {
                if (jTtelephone_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtelephone.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTtelephone_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTtelephone_c.getText().toString().trim());
                } else if (jTtelephone_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtelephone.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtelephone_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTtelephone_d.getText().toString().trim());
                }
            }

            if (!(jTtravelling_d.getText().equals("00.00")) || !(jTtravelling_c.getText().equals("00.00"))) {
                if (jTtravelling_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtravelling.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTtravelling_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTtravelling_c.getText().toString().trim());
                } else if (jTtravelling_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtravelling.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtravelling_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTtravelling_d.getText().toString().trim());
                }
            }

            if (!(jTrepair_d.getText().equals("00.00")) || !(jTrepair_c.getText().equals("00.00"))) {
                if (jTrepair_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrepair.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTrepair_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTrepair_c.getText().toString().trim());
                } else if (jTrepair_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrepair.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTrepair_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTrepair_d.getText().toString().trim());
                }
            }

            if (!(jTrent_d.getText().equals("00.00")) || !(jTrent_c.getText().equals("00.00"))) {
                if (jTrent_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrent.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTrent_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTrent_c.getText().toString().trim());
                } else if (jTrent_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrent.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTrent_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTrent_d.getText().toString().trim());
                }
            }

            if (!(jTstationary_d.getText().equals("00.00")) || !(jTstationary_c.getText().equals("00.00"))) {
                if (jTstationary_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLstationary.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTstationary_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTstationary_c.getText().toString().trim());
                } else if (jTstationary_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLstationary.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTstationary_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTstationary_d.getText().toString().trim());
                }
            }

            if (!(jTaccountancy_d.getText().equals("00.00")) || !(jTaccountancy_c.getText().equals("00.00"))) {
                if (jTaccountancy_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLaccountancy.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTaccountancy_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTaccountancy_c.getText().toString().trim());
                } else if (jTaccountancy_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLaccountancy.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTaccountancy_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTaccountancy_d.getText().toString().trim());
                }
            }

            if (!(jTbank_charges_d.getText().equals("00.00")) || !(jTbank_charges_c.getText().equals("00.00"))) {
                if (jTbank_charges_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_charges.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTbank_charges_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTbank_charges_c.getText().toString().trim());
                } else if (jTbank_charges_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_charges.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_charges_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTbank_charges_d.getText().toString().trim());
                }
            }

            if (!(jTbank_loan_inter_d.getText().equals("00.00")) || !(jTbank_loan_inter_c.getText().equals("00.00"))) {
                if (jTbank_loan_inter_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_loan_inter.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTbank_loan_inter_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTbank_loan_inter_c.getText().toString().trim());
                } else if (jTbank_loan_inter_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_loan_inter.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_loan_inter_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTbank_loan_inter_d.getText().toString().trim());
                }
            }

            if (!(jTtrade_creditors_d.getText().equals("00.00")) || !(jTtrade_creditors_c.getText().equals("00.00"))) {
                if (jTtrade_creditors_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtrade_creditors.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTtrade_creditors_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTtrade_creditors_c.getText().toString().trim());
                } else if (jTtrade_creditors_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtrade_creditors.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtrade_creditors_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTtrade_creditors_d.getText().toString().trim());
                }
            }

            if (!(jTtrade_debtors_d.getText().equals("00.00")) || !(jTtrade_debtors_c.getText().equals("00.00"))) {
                if (jTtrade_debtors_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtrade_debtor.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTtrade_debtors_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTtrade_debtors_c.getText().toString().trim());
                } else if (jTtrade_debtors_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtrade_debtor.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtrade_debtors_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTtrade_debtors_d.getText().toString().trim());
                }
            }

            if (!(jTbank_loan_d.getText().equals("00.00")) || !(jTbank_loan_c.getText().equals("00.00"))) {
                if (jTbank_loan_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_loan.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTbank_loan_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTbank_loan_c.getText().toString().trim());
                } else if (jTbank_loan_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_loan.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_loan_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTbank_loan_d.getText().toString().trim());
                }
            }

            if (!(jTbank_balance_d.getText().equals("00.00")) || !(jTbank_balance_c.getText().equals("00.00"))) {
                if (jTbank_balance_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_balance.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTbank_balance_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTbank_balance_c.getText().toString().trim());
                } else if (jTbank_balance_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_balance.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_balance_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTbank_balance_d.getText().toString().trim());
                }
            }

            if (!(jTbank_od_d.getText().equals("00.00")) || !(jTbank_od_c.getText().equals("00.00"))) {
                if (jTbank_od_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_od.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTbank_od_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTbank_od_c.getText().toString().trim());
                } else if (jTbank_od_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_od.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_od_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTbank_od_d.getText().toString().trim());
                }
            }

            if (!(jTcash_in_hand_d.getText().equals("00.00")) || !(jTcash_in_hand_c.getText().equals("00.00"))) {
                if (jTcash_in_hand_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLcash_in_hand.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTcash_in_hand_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTcash_in_hand_c.getText().toString().trim());
                } else if (jTcash_in_hand_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLcash_in_hand.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTcash_in_hand_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTcash_in_hand_d.getText().toString().trim());
                }
            }

            if (!(jTproperty_d.getText().equals("00.00")) || !(jTproperty_c.getText().equals("00.00"))) {
                if (jTproperty_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLproperty.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTproperty_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTproperty_c.getText().toString().trim());
                } else if (jTproperty_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLproperty.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTproperty_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTproperty_d.getText().toString().trim());
                }
            }

            if (!(jTexpense_creditors_d.getText().equals("00.00")) || !(jTexpense_creditors_c.getText().equals("00.00"))) {
                if (jTexpense_creditors_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLexpense_creditors.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTexpense_creditors_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTexpense_creditors_c.getText().toString().trim());
                } else if (jTexpense_creditors_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLexpense_creditors.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTexpense_creditors_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTexpense_creditors_d.getText().toString().trim());
                }
            }

            if (!(jTdrawings_d.getText().equals("00.00")) || !(jTdrawings_c.getText().equals("00.00"))) {
                if (jTdrawings_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLdrawings.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTdrawings_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTdrawings_c.getText().toString().trim());
                } else if (jTdrawings_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLdrawings.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTdrawings_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTdrawings_d.getText().toString().trim());
                }
            }

            if (!(jTcapital_d.getText().equals("00.00")) || !(jTcapital_c.getText().equals("00.00"))) {
                if (jTcapital_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLcapital.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTcapital_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTcapital_c.getText().toString().trim());
                } else if (jTcapital_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLcapital.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTcapital_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTcapital_d.getText().toString().trim());
                }
            }

            if (!(jTopening_stock_d.getText().equals("00.00")) || !(jTopening_stock_c.getText().equals("00.00"))) {
                if (jTopening_stock_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLopening_stock.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTopening_stock_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTopening_stock_c.getText().toString().trim());
                } else if (jTopening_stock_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLopening_stock.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTopening_stock_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTopening_stock_d.getText().toString().trim());
                }
            }

            if (!(jTinsuarance_d.getText().equals("00.00")) || !(jTinsuarance_c.getText().equals("00.00"))) {
                if (jTinsuarance_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLinsuarance.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTinsuarance_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTinsuarance_c.getText().toString().trim());
                } else if (jTinsuarance_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLinsuarance.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTinsuarance_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTinsuarance_d.getText().toString().trim());
                }
            }

            if (!(jTlease_interest_d.getText().equals("00.00")) || !(jTlease_interest_c.getText().equals("00.00"))) {
                if (jTlease_interest_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLlease_interest.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTlease_interest_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTlease_interest_c.getText().toString().trim());
                } else if (jTlease_interest_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLlease_interest.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTlease_interest_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTlease_interest_d.getText().toString().trim());
                }
            }

            if (!(jTsundries_d.getText().equals("00.00")) || !(jTsundries_c.getText().equals("00.00"))) {
                if (jTsundries_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLsundries.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTsundries_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTsundries_c.getText().toString().trim());
                } else if (jTsundries_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLsundries.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTsundries_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTsundries_d.getText().toString().trim());
                }
            }

            if (!(jTstaff_foods_d.getText().equals("00.00")) || !(jTstaff_foods_c.getText().equals("00.00"))) {
                if (jTstaff_foods_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLstaff_foods.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTstaff_foods_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTstaff_foods_c.getText().toString().trim());
                } else if (jTstaff_foods_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLstaff_foods.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTstaff_foods_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTstaff_foods_d.getText().toString().trim());
                }
            }

            if (!(jTdepreciation_d.getText().equals("00.00")) || !(jTdepreciation_c.getText().equals("00.00"))) {
                if (jTdepreciation_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLdepreciation.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTdepreciation_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTdepreciation_c.getText().toString().trim());
                } else if (jTdepreciation_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLdepreciation.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTdepreciation_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTdepreciation_d.getText().toString().trim());
                }
            }
            
            HashMap para = new HashMap();

            para.put("line1", jTline1.getText().trim());
            para.put("line2", jTline2.getText().trim());
            para.put("line3", jTline3.getText().trim());
            para.put("credit_total", df.format(c));
            para.put("debit_total", df.format(d));

            JasperReport r = JasperCompileManager.compileReport("C:\\reports\\audit\\trial_balance.jrxml");

            JasperPrint jp = JasperFillManager.fillReport(r, para, new JRTableModelDataSource(jTable1.getModel()));
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void calProftloss() {
        try {
            double s = 0;
            double os = 0;
            double p = 0;
            double osp = 0;
            double cs = 0;
            double ospcs = 0;
            double gp = 0;
            double np = 0;
            double ex = 0;


            if (!(jTsales_d.getText().equals("00.00")) || !(jTsales_c.getText().equals("00.00"))) {
                if (jTsales_d.getText().equals("00.00")) {
                    s = Double.parseDouble(jTsales_c.getText().toString().trim());
                } else if (jTsales_c.getText().equals("00.00")) {
                    s = Double.parseDouble(jTsales_d.getText().toString().trim());
                }
            }

            if (!(jTopening_stock_d.getText().equals("00.00")) || !(jTopening_stock_c.getText().equals("00.00"))) {
                if (jTopening_stock_d.getText().equals("00.00")) {
                    os = Double.parseDouble(jTopening_stock_c.getText().toString().trim());
                } else if (jTopening_stock_c.getText().equals("00.00")) {
                    os = Double.parseDouble(jTopening_stock_d.getText().toString().trim());
                }
            }

            if (!(jTpurchase_d.getText().equals("00.00")) || !(jTpurchase_c.getText().equals("00.00"))) {
                if (jTpurchase_d.getText().equals("00.00")) {
                    p = Double.parseDouble(jTpurchase_c.getText().toString().trim());
                } else if (jTpurchase_c.getText().equals("00.00")) {
                    p = Double.parseDouble(jTpurchase_d.getText().toString().trim());
                }
            }

            if (!(jTclosing_stock_d.getText().equals("00.00")) || !(jTclosing_stock_c.getText().equals("00.00"))) {
                if (jTclosing_stock_d.getText().equals("00.00")) {
                    cs = Double.parseDouble(jTclosing_stock_c.getText().toString().trim());
                } else if (jTclosing_stock_c.getText().equals("00.00")) {
                    cs = Double.parseDouble(jTclosing_stock_d.getText().toString().trim());
                }
            }

            osp = os + p;
            ospcs = osp - cs;
            gp = s - ospcs;

            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);

            double c = 0;
            double d = 0;

            if (!(jTsalary_d.getText().equals("00.00")) || !(jTsalary_c.getText().equals("00.00"))) {
                if (jTsalary_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLsalary.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTsalary_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTsalary_c.getText().toString().trim());
                } else if (jTsalary_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLsalary.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTsalary_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTsalary_d.getText().toString().trim());
                }
            }

            if (!(jTepf_d.getText().equals("00.00")) || !(jTepf_c.getText().equals("00.00"))) {
                if (jTepf_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLepf.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTepf_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTepf_c.getText().toString().trim());
                } else if (jTepf_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLepf.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTepf_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTepf_d.getText().toString().trim());
                }
            }

            if (!(jTetf_d.getText().equals("00.00")) || !(jTetf_c.getText().equals("00.00"))) {
                if (jTetf_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLetf.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTetf_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTetf_c.getText().toString().trim());
                } else if (jTetf_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLetf.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTetf_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTetf_d.getText().toString().trim());
                }
            }

            if (!(jTelectricity_d.getText().equals("00.00")) || !(jTelectricity_c.getText().equals("00.00"))) {
                if (jTelectricity_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLelectrcity.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTelectricity_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTelectricity_c.getText().toString().trim());
                } else if (jTelectricity_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLelectrcity.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTelectricity_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTelectricity_d.getText().toString().trim());
                }
            }

            if (!(jTwater_d.getText().equals("00.00")) || !(jTwater_c.getText().equals("00.00"))) {
                if (jTwater_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLwater.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTwater_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTwater_c.getText().toString().trim());
                } else if (jTwater_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLwater.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTwater_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTwater_d.getText().toString().trim());
                }
            }

            if (!(jTtravelling_d.getText().equals("00.00")) || !(jTtravelling_c.getText().equals("00.00"))) {
                if (jTtravelling_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtravelling.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtravelling_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTtravelling_c.getText().toString().trim());
                } else if (jTtravelling_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtravelling.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtravelling_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTtravelling_d.getText().toString().trim());
                }
            }

            if (!(jTtelephone_d.getText().equals("00.00")) || !(jTtelephone_c.getText().equals("00.00"))) {
                if (jTtelephone_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtelephone.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtelephone_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTtelephone_c.getText().toString().trim());
                } else if (jTtelephone_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtelephone.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtelephone_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTtelephone_d.getText().toString().trim());
                }
            }

            if (!(jTrepair_d.getText().equals("00.00")) || !(jTrepair_c.getText().equals("00.00"))) {
                if (jTrepair_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrepair.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTrepair_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTrepair_c.getText().toString().trim());
                } else if (jTrepair_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrepair.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTrepair_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTrepair_d.getText().toString().trim());
                }
            }

            if (!(jTrent_d.getText().equals("00.00")) || !(jTrent_c.getText().equals("00.00"))) {
                if (jTrent_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrent.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTrent_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTrent_c.getText().toString().trim());
                } else if (jTrent_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrent.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTrent_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTrent_d.getText().toString().trim());
                }
            }

            if (!(jTstationary_d.getText().equals("00.00")) || !(jTstationary_c.getText().equals("00.00"))) {
                if (jTstationary_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLstationary.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTstationary_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTstationary_c.getText().toString().trim());
                } else if (jTstationary_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLstationary.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTstationary_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTstationary_d.getText().toString().trim());
                }
            }

            if (!(jTaccountancy_d.getText().equals("00.00")) || !(jTaccountancy_c.getText().equals("00.00"))) {
                if (jTaccountancy_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLaccountancy.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTaccountancy_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTaccountancy_c.getText().toString().trim());
                } else if (jTaccountancy_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLaccountancy.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTaccountancy_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTaccountancy_d.getText().toString().trim());
                }
            }

            if (!(jTbank_charges_d.getText().equals("00.00")) || !(jTbank_charges_c.getText().equals("00.00"))) {
                if (jTbank_charges_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_charges.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_charges_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTbank_charges_c.getText().toString().trim());
                } else if (jTbank_charges_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_charges.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_charges_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTbank_charges_d.getText().toString().trim());
                }
            }

            if (!(jTbank_loan_inter_d.getText().equals("00.00")) || !(jTbank_loan_inter_c.getText().equals("00.00"))) {
                if (jTbank_loan_inter_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_loan_inter.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_loan_inter_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTbank_loan_inter_c.getText().toString().trim());
                } else if (jTbank_loan_inter_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_loan_inter.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_loan_inter_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTbank_loan_inter_d.getText().toString().trim());
                }
            }


            if (!(jTinsuarance_d.getText().equals("00.00")) || !(jTinsuarance_c.getText().equals("00.00"))) {
                if (jTinsuarance_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLinsuarance.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTinsuarance_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTinsuarance_c.getText().toString().trim());
                } else if (jTinsuarance_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLinsuarance.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTinsuarance_d.getText().toString().trim())));;
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTinsuarance_d.getText().toString().trim());
                }
            }

            if (!(jTlease_interest_d.getText().equals("00.00")) || !(jTlease_interest_c.getText().equals("00.00"))) {
                if (jTlease_interest_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLlease_interest.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTlease_interest_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTlease_interest_c.getText().toString().trim());
                } else if (jTlease_interest_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLlease_interest.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTlease_interest_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTlease_interest_d.getText().toString().trim());
                }
            }

            if (!(jTdepreciation_d.getText().equals("00.00")) || !(jTdepreciation_c.getText().equals("00.00"))) {
                if (jTdepreciation_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLdepreciation.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTdepreciation_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTdepreciation_c.getText().toString().trim());
                } else if (jTdepreciation_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLdepreciation.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTdepreciation_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTdepreciation_d.getText().toString().trim());
                }
            }
            
            for (int x = 0; x < dtm.getRowCount(); x++) {
                ex = ex + Double.parseDouble(jTable2.getValueAt(x, 1).toString());
            }
            np = gp - ex;
            HashMap para = new HashMap();

            para.put("line1", jTline1.getText().trim());
            para.put("line2", jTline2.getText().trim());
            para.put("line3", jTline3.getText().trim());
            para.put("s", df.format(s));
            para.put("os", df.format(os));
            para.put("p", df.format(p));
            para.put("osp", df.format(osp));
            para.put("cs", df.format(cs));
            para.put("ospcs", df.format(ospcs));
            para.put("gp", df.format(gp));
            para.put("ex", df.format(ex));
            para.put("np", df.format(np));

            JasperReport r = JasperCompileManager.compileReport("C:\\reports\\audit\\profit_loss.jrxml");

            JasperPrint jp = JasperFillManager.fillReport(r, para, new JRTableModelDataSource(jTable2.getModel()));
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double netProft() {
            double s = 0;
            double os = 0;
            double p = 0;
            double osp = 0;
            double cs = 0;
            double ospcs = 0;
            double gp = 0;
            double np = 0;
            double ex = 0;


            if (!(jTsales_d.getText().equals("00.00")) || !(jTsales_c.getText().equals("00.00"))) {
                if (jTsales_d.getText().equals("00.00")) {
                    s = Double.parseDouble(jTsales_c.getText().toString().trim());
                } else if (jTsales_c.getText().equals("00.00")) {
                    s = Double.parseDouble(jTsales_d.getText().toString().trim());
                }
            }

            if (!(jTopening_stock_d.getText().equals("00.00")) || !(jTopening_stock_c.getText().equals("00.00"))) {
                if (jTopening_stock_d.getText().equals("00.00")) {
                    os = Double.parseDouble(jTopening_stock_c.getText().toString().trim());
                } else if (jTopening_stock_c.getText().equals("00.00")) {
                    os = Double.parseDouble(jTopening_stock_d.getText().toString().trim());
                }
            }

            if (!(jTpurchase_d.getText().equals("00.00")) || !(jTpurchase_c.getText().equals("00.00"))) {
                if (jTpurchase_d.getText().equals("00.00")) {
                    p = Double.parseDouble(jTpurchase_c.getText().toString().trim());
                } else if (jTpurchase_c.getText().equals("00.00")) {
                    p = Double.parseDouble(jTpurchase_d.getText().toString().trim());
                }
            }

            if (!(jTclosing_stock_d.getText().equals("00.00")) || !(jTclosing_stock_c.getText().equals("00.00"))) {
                if (jTclosing_stock_d.getText().equals("00.00")) {
                    cs = Double.parseDouble(jTclosing_stock_c.getText().toString().trim());
                } else if (jTclosing_stock_c.getText().equals("00.00")) {
                    cs = Double.parseDouble(jTclosing_stock_d.getText().toString().trim());
                }
            }

            osp = os + p;
            ospcs = osp - cs;
            gp = s - ospcs;

            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);

            double c = 0;
            double d = 0;

            if (!(jTsalary_d.getText().equals("00.00")) || !(jTsalary_c.getText().equals("00.00"))) {
                if (jTsalary_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLsalary.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTsalary_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTsalary_c.getText().toString().trim());
                } else if (jTsalary_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLsalary.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTsalary_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTsalary_d.getText().toString().trim());
                }
            }

            if (!(jTepf_d.getText().equals("00.00")) || !(jTepf_c.getText().equals("00.00"))) {
                if (jTepf_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLepf.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTepf_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTepf_c.getText().toString().trim());
                } else if (jTepf_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLepf.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTepf_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTepf_d.getText().toString().trim());
                }
            }

            if (!(jTetf_d.getText().equals("00.00")) || !(jTetf_c.getText().equals("00.00"))) {
                if (jTetf_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLetf.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTetf_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTetf_c.getText().toString().trim());
                } else if (jTetf_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLetf.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTetf_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTetf_d.getText().toString().trim());
                }
            }

            if (!(jTelectricity_d.getText().equals("00.00")) || !(jTelectricity_c.getText().equals("00.00"))) {
                if (jTelectricity_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLelectrcity.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTelectricity_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTelectricity_c.getText().toString().trim());
                } else if (jTelectricity_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLelectrcity.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTelectricity_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTelectricity_d.getText().toString().trim());
                }
            }

            if (!(jTwater_d.getText().equals("00.00")) || !(jTwater_c.getText().equals("00.00"))) {
                if (jTwater_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLwater.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTwater_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTwater_c.getText().toString().trim());
                } else if (jTwater_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLwater.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTwater_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTwater_d.getText().toString().trim());
                }
            }

            if (!(jTtravelling_d.getText().equals("00.00")) || !(jTtravelling_c.getText().equals("00.00"))) {
                if (jTtravelling_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtravelling.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtravelling_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTtravelling_c.getText().toString().trim());
                } else if (jTtravelling_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtravelling.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtravelling_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTtravelling_d.getText().toString().trim());
                }
            }

            if (!(jTtelephone_d.getText().equals("00.00")) || !(jTtelephone_c.getText().equals("00.00"))) {
                if (jTtelephone_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtelephone.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtelephone_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTtelephone_c.getText().toString().trim());
                } else if (jTtelephone_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLtelephone.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTtelephone_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTtelephone_d.getText().toString().trim());
                }
            }

            if (!(jTrepair_d.getText().equals("00.00")) || !(jTrepair_c.getText().equals("00.00"))) {
                if (jTrepair_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrepair.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTrepair_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTrepair_c.getText().toString().trim());
                } else if (jTrepair_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrepair.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTrepair_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTrepair_d.getText().toString().trim());
                }
            }

            if (!(jTrent_d.getText().equals("00.00")) || !(jTrent_c.getText().equals("00.00"))) {
                if (jTrent_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrent.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTrent_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTrent_c.getText().toString().trim());
                } else if (jTrent_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLrent.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTrent_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTrent_d.getText().toString().trim());
                }
            }

            if (!(jTstationary_d.getText().equals("00.00")) || !(jTstationary_c.getText().equals("00.00"))) {
                if (jTstationary_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLstationary.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTstationary_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTstationary_c.getText().toString().trim());
                } else if (jTstationary_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLstationary.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTstationary_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTstationary_d.getText().toString().trim());
                }
            }

            if (!(jTaccountancy_d.getText().equals("00.00")) || !(jTaccountancy_c.getText().equals("00.00"))) {
                if (jTaccountancy_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLaccountancy.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTaccountancy_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTaccountancy_c.getText().toString().trim());
                } else if (jTaccountancy_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLaccountancy.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTaccountancy_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTaccountancy_d.getText().toString().trim());
                }
            }

            if (!(jTbank_charges_d.getText().equals("00.00")) || !(jTbank_charges_c.getText().equals("00.00"))) {
                if (jTbank_charges_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_charges.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_charges_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTbank_charges_c.getText().toString().trim());
                } else if (jTbank_charges_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_charges.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_charges_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTbank_charges_d.getText().toString().trim());
                }
            }

            if (!(jTbank_loan_inter_d.getText().equals("00.00")) || !(jTbank_loan_inter_c.getText().equals("00.00"))) {
                if (jTbank_loan_inter_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_loan_inter.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_loan_inter_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTbank_loan_inter_c.getText().toString().trim());
                } else if (jTbank_loan_inter_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLbank_loan_inter.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTbank_loan_inter_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTbank_loan_inter_d.getText().toString().trim());
                }
            }


            if (!(jTinsuarance_d.getText().equals("00.00")) || !(jTinsuarance_c.getText().equals("00.00"))) {
                if (jTinsuarance_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLinsuarance.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTinsuarance_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTinsuarance_c.getText().toString().trim());
                } else if (jTinsuarance_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLinsuarance.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTinsuarance_d.getText().toString().trim())));;
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTinsuarance_d.getText().toString().trim());
                }
            }

            if (!(jTlease_interest_d.getText().equals("00.00")) || !(jTlease_interest_c.getText().equals("00.00"))) {
                if (jTlease_interest_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLlease_interest.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTlease_interest_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTlease_interest_c.getText().toString().trim());
                } else if (jTlease_interest_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLlease_interest.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTlease_interest_d.getText().toString().trim())));
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTlease_interest_d.getText().toString().trim());
                }
            }

            if (!(jTdepreciation_d.getText().equals("00.00")) || !(jTdepreciation_c.getText().equals("00.00"))) {
                if (jTdepreciation_d.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLdepreciation.getText().toString().trim());
                    v.add("");
                    v.add(df.format(Double.parseDouble(jTdepreciation_c.getText().toString().trim())));
                    dtm.addRow(v);
                    c = c + Double.parseDouble(jTdepreciation_c.getText().toString().trim());
                } else if (jTdepreciation_c.getText().equals("00.00")) {
                    Vector v = new Vector();
                    v.add(jLdepreciation.getText().toString().trim());
                    v.add(df.format(Double.parseDouble(jTdepreciation_d.getText().toString().trim())));
                    v.add("");
                    dtm.addRow(v);
                    d = d + Double.parseDouble(jTdepreciation_d.getText().toString().trim());
                }
            }
            
            for (int x = 0; x < dtm.getRowCount(); x++) {
                ex = ex + Double.parseDouble(jTable2.getValueAt(x, 1).toString());
            }
            np = gp - ex;
          
        return np;
    }

    void calBalancesheet() {
        try {
            String dproperty = "0.0";
            String dclosing_stock = "0.0";
            String strade_detors = "";
            String dtrade_detors = "0.0";
            String sbank_balance = "";
            String dbank_balance = "0.0";
            String scash_in_hand = "";
            String dcash_in_hand = "0.0";
            String sexpenses_creditors = "";
            String dexpenses_creditors = "0.0";
            String strade_creditors = "";
            String dtrade_creditors = "0.0";
            String sbank_od = "";
            String dbank_od = "0.0";
            String sbank_loan = "";
            String dbank_loan = "0.0";
            String sdrawings = "";
            String ddrawings = "0.0";
            String scapital = "";
            String dcapital = "0.0";

            if (!(jTproperty_d.getText().equals("00.00")) || !(jTproperty_c.getText().equals("00.00"))) {
                if (jTproperty_d.getText().equals("00.00")) {
                    dproperty = (df.format(Double.parseDouble(jTproperty_c.getText().toString().trim())));
                } else if (jTproperty_c.getText().equals("00.00")) {
                    dproperty = (df.format(Double.parseDouble(jTproperty_d.getText().toString().trim())));
                }
            }

            if (!(jTclosing_stock_d.getText().equals("00.00")) || !(jTclosing_stock_c.getText().equals("00.00"))) {
                if (jTclosing_stock_d.getText().equals("00.00")) {
                    dclosing_stock = (df.format(Double.parseDouble(jTclosing_stock_c.getText().toString().trim())));
                } else if (jTclosing_stock_c.getText().equals("00.00")) {
                    dclosing_stock = (df.format(Double.parseDouble(jTclosing_stock_d.getText().toString().trim())));
                }
            }

            if (!(jTtrade_debtors_d.getText().equals("00.00")) || !(jTtrade_debtors_c.getText().equals("00.00"))) {
                if (jTtrade_debtors_d.getText().equals("00.00")) {
                    strade_detors = (jLtrade_debtor.getText().toString().trim());
                    dtrade_detors = (df.format(Double.parseDouble(jTtrade_debtors_c.getText().toString().trim())));
                } else if (jTtrade_debtors_c.getText().equals("00.00")) {
                    strade_detors = (jLtrade_debtor.getText().toString().trim());
                    dtrade_detors = (df.format(Double.parseDouble(jTtrade_debtors_d.getText().toString().trim())));
                }
            }

            if (!(jTbank_balance_d.getText().equals("00.00")) || !(jTbank_balance_c.getText().equals("00.00"))) {
                if (jTbank_balance_d.getText().equals("00.00")) {
                    sbank_balance = (jLbank_balance.getText().toString().trim());
                    dbank_balance = (df.format(Double.parseDouble(jTbank_balance_c.getText().toString().trim())));
                } else if (jTbank_balance_c.getText().equals("00.00")) {
                    sbank_balance = (jLbank_balance.getText().toString().trim());
                    dbank_balance = (df.format(Double.parseDouble(jTbank_balance_d.getText().toString().trim())));
                }
            }

            if (!(jTcash_in_hand_d.getText().equals("00.00")) || !(jTcash_in_hand_c.getText().equals("00.00"))) {
                if (jTcash_in_hand_d.getText().equals("00.00")) {
                    scash_in_hand = (jLcash_in_hand.getText().toString().trim());
                    dcash_in_hand = (df.format(Double.parseDouble(jTcash_in_hand_c.getText().toString().trim())));
                } else if (jTcash_in_hand_c.getText().equals("00.00")) {
                    scash_in_hand = (jLcash_in_hand.getText().toString().trim());
                    dcash_in_hand = (df.format(Double.parseDouble(jTcash_in_hand_d.getText().toString().trim())));
                }
            }

            if (!(jTexpense_creditors_d.getText().equals("00.00")) || !(jTexpense_creditors_c.getText().equals("00.00"))) {
                if (jTexpense_creditors_d.getText().equals("00.00")) {
                    sexpenses_creditors = (jLexpense_creditors.getText().toString().trim());
                    dexpenses_creditors = (df.format(Double.parseDouble(jTexpense_creditors_c.getText().toString().trim())));
                } else if (jTexpense_creditors_c.getText().equals("00.00")) {
                    sexpenses_creditors = (jLexpense_creditors.getText().toString().trim());
                    dexpenses_creditors = (df.format(Double.parseDouble(jTexpense_creditors_d.getText().toString().trim())));
                }
            }

            if (!(jTtrade_creditors_d.getText().equals("00.00")) || !(jTtrade_creditors_c.getText().equals("00.00"))) {
                if (jTtrade_creditors_d.getText().equals("00.00")) {
                    strade_creditors = (jLtrade_creditors.getText().toString().trim());
                    dtrade_creditors = (df.format(Double.parseDouble(jTtrade_creditors_c.getText().toString().trim())));
                } else if (jTtrade_creditors_c.getText().equals("00.00")) {
                    strade_creditors = (jLtrade_creditors.getText().toString().trim());
                    dtrade_creditors = (df.format(Double.parseDouble(jTtrade_creditors_d.getText().toString().trim())));
                }
            }

            if (!(jTbank_od_d.getText().equals("00.00")) || !(jTbank_od_c.getText().equals("00.00"))) {
                if (jTbank_od_d.getText().equals("00.00")) {
                    sbank_od = (jLbank_od.getText().toString().trim());
                    dbank_od = (df.format(Double.parseDouble(jTbank_od_c.getText().toString().trim())));
                } else if (jTbank_od_c.getText().equals("00.00")) {
                    sbank_od = (jLbank_od.getText().toString().trim());
                    dbank_od = (df.format(Double.parseDouble(jTbank_od_d.getText().toString().trim())));
                }
            }

            if (!(jTbank_loan_d.getText().equals("00.00")) || !(jTbank_loan_c.getText().equals("00.00"))) {
                if (jTbank_loan_d.getText().equals("00.00")) {
                    sbank_loan = (jLbank_loan.getText().toString().trim());
                    dbank_loan = (df.format(Double.parseDouble(jTbank_loan_c.getText().toString().trim())));
                } else if (jTbank_loan_c.getText().equals("00.00")) {
                    sbank_loan = (jLbank_loan.getText().toString().trim());
                    dbank_loan = (df.format(Double.parseDouble(jTbank_loan_d.getText().toString().trim())));
                }
            }

            if (!(jTcapital_d.getText().equals("00.00")) || !(jTcapital_c.getText().equals("00.00"))) {
                if (jTcapital_d.getText().equals("00.00")) {
                    scapital = (jLcapital.getText().toString().trim());
                    dcapital = (df.format(Double.parseDouble(jTcapital_c.getText().toString().trim())));
                } else if (jTcapital_c.getText().equals("00.00")) {
                    scapital = (jLcapital.getText().toString().trim());
                    dcapital = (df.format(Double.parseDouble(jTcapital_d.getText().toString().trim())));
                }
            }

            if (!(jTdrawings_d.getText().equals("00.00")) || !(jTdrawings_c.getText().equals("00.00"))) {
                if (jTdrawings_d.getText().equals("00.00")) {
                    sdrawings = (jLdrawings.getText().toString().trim());
                    ddrawings = (df.format(Double.parseDouble(jTdrawings_c.getText().toString().trim())));
                } else if (jTdrawings_c.getText().equals("00.00")) {
                    sdrawings = (jLdrawings.getText().toString().trim());
                    ddrawings = (df.format(Double.parseDouble(jTdrawings_d.getText().toString().trim())));
                }
            }

            double v4 = 0;
            double v5 = 0;
            double v6 = 0;
            double v8 = 0;
            double v9 = 0;
            double v10 = 0;

            double tca = 0;
            double tcl = 0;
            double tcatcl = 0;
            double v1tcatcl = 0;
            double tv11v12 = 0;
            double v13tv11v12 = 0;


            String n4 = "";
            String n5 = "";
            String n6 = "";
            String n8 = "";
            String n9 = "";
            String n10 = "";

            if (!(dtrade_detors.equals("00.00")) && !(dbank_balance.equals("00.00")) && !(dcash_in_hand.equals("00.00"))) {
                n4 = jLtrade_debtor.getText().toString().trim();
                v4 = Double.parseDouble(dtrade_detors);

                n5 = jLbank_balance.getText().toString().trim();
                v5 = Double.parseDouble(dbank_balance);

                n6 = jLcash_in_hand.getText().toString().trim();
                v6 = Double.parseDouble(dcash_in_hand);
            } else if ((dtrade_detors.equals("00.00")) && !(dbank_balance.equals("00.00")) && !(dcash_in_hand.equals("00.00"))) {
                n4 = jLbank_balance.getText().toString().trim();
                v4 = Double.parseDouble(dbank_balance);

                n5 = jLcash_in_hand.getText().toString().trim();
                v5 = Double.parseDouble(dcash_in_hand);
            } else if ((dtrade_detors.equals("00.00")) && (dbank_balance.equals("00.00")) && !(dcash_in_hand.equals("00.00"))) {
                n4 = jLcash_in_hand.getText().toString().trim();
                v4 = Double.parseDouble(dcash_in_hand);
            } else if (!(dtrade_detors.equals("00.00")) && (dbank_balance.equals("00.00")) && (dcash_in_hand.equals("00.00"))) {
                n4 = jLtrade_debtor.getText().toString().trim();
                v4 = Double.parseDouble(dtrade_detors);
            } else if ((dtrade_detors.equals("00.00")) && !(dbank_balance.equals("00.00")) && (dcash_in_hand.equals("00.00"))) {
                n4 = jLbank_balance.getText().toString().trim();
                v4 = Double.parseDouble(dbank_balance);
            } else if (!(dtrade_detors.equals("00.00")) && !(dbank_balance.equals("00.00")) && (dcash_in_hand.equals("00.00"))) {
                n4 = jLtrade_debtor.getText().toString().trim();
                v4 = Double.parseDouble(dtrade_detors);

                n5 = jLbank_balance.getText().toString().trim();
                v5 = Double.parseDouble(dbank_balance);
            } else if (!(dtrade_detors.equals("00.00")) && (dbank_balance.equals("00.00")) && !(dcash_in_hand.equals("00.00"))) {
                n4 = jLtrade_debtor.getText().toString().trim();
                v4 = Double.parseDouble(dtrade_detors);

                n5 = jLcash_in_hand.getText().toString().trim();
                v5 = Double.parseDouble(dcash_in_hand);
            }

            //current liabilities
            if (!(dtrade_creditors.equals("00.00")) && !(dbank_od.equals("00.00")) && !(dbank_loan.equals("00.00"))) {
                n8 = jLtrade_creditors.getText().toString().trim();
                v8 = Double.parseDouble(dtrade_creditors);

                n9 = jLbank_od.getText().toString().trim();
                v9 = Double.parseDouble(dbank_od);

                n10 = jLbank_loan.getText().toString().trim();
                v10 = Double.parseDouble(dbank_loan);
            } else if (!(dtrade_creditors.equals("00.00")) && (dbank_od.equals("00.00")) && (dbank_loan.equals("00.00"))) {
                n8 = jLtrade_creditors.getText().toString().trim();
                v8 = Double.parseDouble(dtrade_creditors);
            } else if ((dtrade_creditors.equals("00.00")) && !(dbank_od.equals("00.00")) && (dbank_loan.equals("00.00"))) {
                n8 = jLbank_od.getText().toString().trim();
                v8 = Double.parseDouble(dbank_od);
            } else if ((dtrade_creditors.equals("00.00")) && (dbank_od.equals("00.00")) && !(dbank_loan.equals("00.00"))) {
                n8 = jLbank_loan.getText().toString().trim();
                v8 = Double.parseDouble(dbank_loan);
            } else if (!(dtrade_creditors.equals("00.00")) && (dbank_od.equals("00.00")) && !(dbank_loan.equals("00.00"))) {
                n8 = jLtrade_creditors.getText().toString().trim();
                v8 = Double.parseDouble(dtrade_creditors);

                n9 = jLbank_loan.getText().toString().trim();
                v9 = Double.parseDouble(dbank_loan);
            } else if (!(dtrade_creditors.equals("00.00")) && !(dbank_od.equals("00.00")) && (dbank_loan.equals("00.00"))) {
                n8 = jLtrade_creditors.getText().toString().trim();
                v8 = Double.parseDouble(dtrade_creditors);

                n9 = jLbank_od.getText().toString().trim();
                v9 = Double.parseDouble(dbank_od);
            } else if ((dtrade_creditors.equals("00.00")) && !(dbank_od.equals("00.00")) && !(dbank_loan.equals("00.00"))) {
                n8 = jLbank_od.getText().toString().trim();
                v8 = Double.parseDouble(dbank_od);

                n9 = jLbank_loan.getText().toString().trim();
                v9 = Double.parseDouble(dbank_loan);
            }

            tca = v4 + v5 + v6 + Double.parseDouble(dclosing_stock);
            tcl = v8 + v9 + v10 + Double.parseDouble(dexpenses_creditors);
            tcatcl = tca - tcl;
            v1tcatcl = tcatcl + Double.parseDouble(dproperty);
            tv11v12 = Double.parseDouble(dcapital) + netProft();
            v13tv11v12 = tv11v12 - Double.parseDouble(ddrawings);

            HashMap para = new HashMap();

            para.put("line1", jTline1.getText().trim());
            para.put("line2", jTline2.getText().trim());
            para.put("line3", jTline3.getText().trim());
            para.put("v1", dproperty);
            para.put("v3", dclosing_stock);
            para.put("v7", dexpenses_creditors);
            para.put("v11", dcapital);
            para.put("v13", ddrawings);
            para.put("v12", df.format(netProft()));
            para.put("tca", df.format(tca));
            para.put("tcl", df.format(tcl));
            para.put("tcatcl", df.format(tcatcl));
            para.put("v1tcatcl", df.format(v1tcatcl));
            para.put("tv11v12", df.format(tv11v12));
            para.put("v13tv11v12", df.format(v13tv11v12));



            para.put("v4", df.format(v4));
            para.put("v5", df.format(v5));
            para.put("v6", df.format(v6));
            para.put("v8", df.format(v8));
            para.put("v9", df.format(v9));
            para.put("v10", df.format(v10));

            para.put("n4", n4);
            para.put("n5", n5);
            para.put("n6", n6);
            para.put("n8", n8);
            para.put("n9", n9);
            para.put("n10", n10);
            
            JasperReport r = JasperCompileManager.compileReport("C:\\reports\\audit\\balance_sheet.jrxml");

            JasperPrint jp = JasperFillManager.fillReport(r, para, new JREmptyDataSource());
            JasperViewer.viewReport(jp, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTsales_d = new javax.swing.JTextField();
        jTsales_c = new javax.swing.JTextField();
        jLsales = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLpurchase = new javax.swing.JLabel();
        jTpurchase_d = new javax.swing.JTextField();
        jTpurchase_c = new javax.swing.JTextField();
        jLsalary = new javax.swing.JLabel();
        jTsalary_d = new javax.swing.JTextField();
        jTsalary_c = new javax.swing.JTextField();
        jLelectrcity = new javax.swing.JLabel();
        jLetf = new javax.swing.JLabel();
        jLepf = new javax.swing.JLabel();
        jTepf_d = new javax.swing.JTextField();
        jTetf_d = new javax.swing.JTextField();
        jTelectricity_d = new javax.swing.JTextField();
        jTelectricity_c = new javax.swing.JTextField();
        jTetf_c = new javax.swing.JTextField();
        jTepf_c = new javax.swing.JTextField();
        jLstationary = new javax.swing.JLabel();
        jLrent = new javax.swing.JLabel();
        jLrepair = new javax.swing.JLabel();
        jLtravelling = new javax.swing.JLabel();
        jLtelephone = new javax.swing.JLabel();
        jLwater = new javax.swing.JLabel();
        jTwater_d = new javax.swing.JTextField();
        jTtelephone_d = new javax.swing.JTextField();
        jTtravelling_d = new javax.swing.JTextField();
        jTtravelling_c = new javax.swing.JTextField();
        jTrepair_d = new javax.swing.JTextField();
        jTrepair_c = new javax.swing.JTextField();
        jTrent_d = new javax.swing.JTextField();
        jTstationary_c = new javax.swing.JTextField();
        jTstationary_d = new javax.swing.JTextField();
        jTrent_c = new javax.swing.JTextField();
        jTtelephone_c = new javax.swing.JTextField();
        jTwater_c = new javax.swing.JTextField();
        jTdrawings_c = new javax.swing.JTextField();
        jTdrawings_d = new javax.swing.JTextField();
        jLdrawings = new javax.swing.JLabel();
        jLexpense_creditors = new javax.swing.JLabel();
        jLproperty = new javax.swing.JLabel();
        jLcash_in_hand = new javax.swing.JLabel();
        jLbank_od = new javax.swing.JLabel();
        jLbank_balance = new javax.swing.JLabel();
        jLbank_loan = new javax.swing.JLabel();
        jLtrade_debtor = new javax.swing.JLabel();
        jLtrade_creditors = new javax.swing.JLabel();
        jLbank_loan_inter = new javax.swing.JLabel();
        jLbank_charges = new javax.swing.JLabel();
        jLaccountancy = new javax.swing.JLabel();
        jTaccountancy_d = new javax.swing.JTextField();
        jTbank_charges_d = new javax.swing.JTextField();
        jTbank_loan_inter_d = new javax.swing.JTextField();
        jTtrade_creditors_d = new javax.swing.JTextField();
        jTtrade_debtors_d = new javax.swing.JTextField();
        jTbank_loan_d = new javax.swing.JTextField();
        jTbank_balance_d = new javax.swing.JTextField();
        jTbank_od_d = new javax.swing.JTextField();
        jTcash_in_hand_d = new javax.swing.JTextField();
        jTproperty_d = new javax.swing.JTextField();
        jTexpense_creditors_d = new javax.swing.JTextField();
        jTexpense_creditors_c = new javax.swing.JTextField();
        jTcash_in_hand_c = new javax.swing.JTextField();
        jTbank_od_c = new javax.swing.JTextField();
        jTbank_balance_c = new javax.swing.JTextField();
        jTbank_loan_c = new javax.swing.JTextField();
        jTtrade_debtors_c = new javax.swing.JTextField();
        jTtrade_creditors_c = new javax.swing.JTextField();
        jTbank_loan_inter_c = new javax.swing.JTextField();
        jTbank_charges_c = new javax.swing.JTextField();
        jTaccountancy_c = new javax.swing.JTextField();
        jLopening_stock = new javax.swing.JLabel();
        jLcapital = new javax.swing.JLabel();
        jTcapital_d = new javax.swing.JTextField();
        jTopening_stock_d = new javax.swing.JTextField();
        jTcapital_c = new javax.swing.JTextField();
        jTopening_stock_c = new javax.swing.JTextField();
        jTproperty_c = new javax.swing.JTextField();
        jLinsuarance = new javax.swing.JLabel();
        jTinsuarance_d = new javax.swing.JTextField();
        jTinsuarance_c = new javax.swing.JTextField();
        jLlease_interest = new javax.swing.JLabel();
        jTlease_interest_d = new javax.swing.JTextField();
        jTlease_interest_c = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLclosing_stock = new javax.swing.JLabel();
        jTclosing_stock_d = new javax.swing.JTextField();
        jTclosing_stock_c = new javax.swing.JTextField();
        jLsundries = new javax.swing.JLabel();
        jTsundries_d = new javax.swing.JTextField();
        jTsundries_c = new javax.swing.JTextField();
        jLstaff_foods = new javax.swing.JLabel();
        jTstaff_foods_d = new javax.swing.JTextField();
        jTstaff_foods_c = new javax.swing.JTextField();
        jLdepreciation = new javax.swing.JLabel();
        jTdepreciation_d = new javax.swing.JTextField();
        jTdepreciation_c = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTline2 = new javax.swing.JTextField();
        jTline1 = new javax.swing.JTextField();
        jTline3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Debit", "Credit"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "d", "a"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Debit");

        jTsales_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTsales_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTsales_d.setText("00.00");

        jTsales_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTsales_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTsales_c.setText("00.00");

        jLsales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLsales.setText("Sales");
        jLsales.setPreferredSize(new java.awt.Dimension(241, 241));

        jLabel156.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel156.setText("Credit");

        jLpurchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLpurchase.setText("Purchase");
        jLpurchase.setPreferredSize(new java.awt.Dimension(241, 241));

        jTpurchase_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTpurchase_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTpurchase_d.setText("00.00");

        jTpurchase_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTpurchase_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTpurchase_c.setText("00.00");

        jLsalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLsalary.setText("Salary & wages");
        jLsalary.setPreferredSize(new java.awt.Dimension(241, 241));

        jTsalary_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTsalary_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTsalary_d.setText("00.00");

        jTsalary_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTsalary_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTsalary_c.setText("00.00");

        jLelectrcity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLelectrcity.setText("Electricity");
        jLelectrcity.setPreferredSize(new java.awt.Dimension(241, 241));

        jLetf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLetf.setText("ETF");
        jLetf.setPreferredSize(new java.awt.Dimension(241, 241));

        jLepf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLepf.setText("EPF");
        jLepf.setPreferredSize(new java.awt.Dimension(241, 241));

        jTepf_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTepf_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTepf_d.setText("00.00");

        jTetf_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTetf_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTetf_d.setText("00.00");

        jTelectricity_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTelectricity_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTelectricity_d.setText("00.00");

        jTelectricity_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTelectricity_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTelectricity_c.setText("00.00");

        jTetf_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTetf_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTetf_c.setText("00.00");

        jTepf_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTepf_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTepf_c.setText("00.00");

        jLstationary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLstationary.setText("Stationary & postage");
        jLstationary.setPreferredSize(new java.awt.Dimension(241, 241));

        jLrent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLrent.setText("Rent");
        jLrent.setPreferredSize(new java.awt.Dimension(241, 241));

        jLrepair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLrepair.setText("Repairs & maintainance");
        jLrepair.setPreferredSize(new java.awt.Dimension(241, 241));

        jLtravelling.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLtravelling.setText("Travelling");
        jLtravelling.setPreferredSize(new java.awt.Dimension(241, 241));

        jLtelephone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLtelephone.setText("Telephone");
        jLtelephone.setPreferredSize(new java.awt.Dimension(241, 241));

        jLwater.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLwater.setText("Water");
        jLwater.setPreferredSize(new java.awt.Dimension(241, 241));

        jTwater_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTwater_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTwater_d.setText("00.00");

        jTtelephone_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTtelephone_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTtelephone_d.setText("00.00");

        jTtravelling_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTtravelling_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTtravelling_d.setText("00.00");

        jTtravelling_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTtravelling_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTtravelling_c.setText("00.00");

        jTrepair_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTrepair_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTrepair_d.setText("00.00");

        jTrepair_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTrepair_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTrepair_c.setText("00.00");

        jTrent_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTrent_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTrent_d.setText("00.00");

        jTstationary_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTstationary_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTstationary_c.setText("00.00");

        jTstationary_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTstationary_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTstationary_d.setText("00.00");

        jTrent_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTrent_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTrent_c.setText("00.00");

        jTtelephone_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTtelephone_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTtelephone_c.setText("00.00");

        jTwater_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTwater_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTwater_c.setText("00.00");

        jTdrawings_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTdrawings_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTdrawings_c.setText("00.00");

        jTdrawings_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTdrawings_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTdrawings_d.setText("00.00");

        jLdrawings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLdrawings.setText("Drawings");
        jLdrawings.setPreferredSize(new java.awt.Dimension(241, 241));

        jLexpense_creditors.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLexpense_creditors.setText("Expense creditors");
        jLexpense_creditors.setPreferredSize(new java.awt.Dimension(241, 241));

        jLproperty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLproperty.setText("Property, plant & equipments");
        jLproperty.setPreferredSize(new java.awt.Dimension(241, 241));

        jLcash_in_hand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLcash_in_hand.setText("Cash in hand");
        jLcash_in_hand.setPreferredSize(new java.awt.Dimension(241, 241));

        jLbank_od.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLbank_od.setText("Bank O/D");
        jLbank_od.setPreferredSize(new java.awt.Dimension(241, 241));

        jLbank_balance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLbank_balance.setText("Bank balance");
        jLbank_balance.setPreferredSize(new java.awt.Dimension(241, 241));

        jLbank_loan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLbank_loan.setText("Bank loan");
        jLbank_loan.setPreferredSize(new java.awt.Dimension(241, 241));

        jLtrade_debtor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLtrade_debtor.setText("Trade debtors");
        jLtrade_debtor.setPreferredSize(new java.awt.Dimension(241, 241));

        jLtrade_creditors.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLtrade_creditors.setText("Trade creditors");
        jLtrade_creditors.setPreferredSize(new java.awt.Dimension(241, 241));

        jLbank_loan_inter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLbank_loan_inter.setText("Bank loan interest");
        jLbank_loan_inter.setPreferredSize(new java.awt.Dimension(241, 241));

        jLbank_charges.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLbank_charges.setText("Bank charges");
        jLbank_charges.setPreferredSize(new java.awt.Dimension(241, 241));

        jLaccountancy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLaccountancy.setText("Accountancy fees");
        jLaccountancy.setPreferredSize(new java.awt.Dimension(241, 241));

        jTaccountancy_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTaccountancy_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTaccountancy_d.setText("00.00");

        jTbank_charges_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTbank_charges_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTbank_charges_d.setText("00.00");

        jTbank_loan_inter_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTbank_loan_inter_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTbank_loan_inter_d.setText("00.00");

        jTtrade_creditors_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTtrade_creditors_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTtrade_creditors_d.setText("00.00");

        jTtrade_debtors_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTtrade_debtors_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTtrade_debtors_d.setText("00.00");

        jTbank_loan_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTbank_loan_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTbank_loan_d.setText("00.00");

        jTbank_balance_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTbank_balance_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTbank_balance_d.setText("00.00");

        jTbank_od_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTbank_od_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTbank_od_d.setText("00.00");

        jTcash_in_hand_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTcash_in_hand_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTcash_in_hand_d.setText("00.00");

        jTproperty_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTproperty_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTproperty_d.setText("00.00");

        jTexpense_creditors_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTexpense_creditors_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTexpense_creditors_d.setText("00.00");

        jTexpense_creditors_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTexpense_creditors_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTexpense_creditors_c.setText("00.00");

        jTcash_in_hand_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTcash_in_hand_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTcash_in_hand_c.setText("00.00");

        jTbank_od_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTbank_od_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTbank_od_c.setText("00.00");

        jTbank_balance_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTbank_balance_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTbank_balance_c.setText("00.00");

        jTbank_loan_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTbank_loan_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTbank_loan_c.setText("00.00");

        jTtrade_debtors_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTtrade_debtors_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTtrade_debtors_c.setText("00.00");

        jTtrade_creditors_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTtrade_creditors_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTtrade_creditors_c.setText("00.00");

        jTbank_loan_inter_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTbank_loan_inter_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTbank_loan_inter_c.setText("00.00");

        jTbank_charges_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTbank_charges_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTbank_charges_c.setText("00.00");

        jTaccountancy_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTaccountancy_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTaccountancy_c.setText("00.00");

        jLopening_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLopening_stock.setText("Opening stock");
        jLopening_stock.setPreferredSize(new java.awt.Dimension(241, 241));

        jLcapital.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLcapital.setText("Capital account");
        jLcapital.setPreferredSize(new java.awt.Dimension(241, 241));

        jTcapital_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTcapital_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTcapital_d.setText("00.00");

        jTopening_stock_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTopening_stock_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTopening_stock_d.setText("00.00");

        jTcapital_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTcapital_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTcapital_c.setText("00.00");

        jTopening_stock_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTopening_stock_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTopening_stock_c.setText("00.00");

        jTproperty_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTproperty_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTproperty_c.setText("00.00");

        jLinsuarance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLinsuarance.setText("Insuarance");
        jLinsuarance.setPreferredSize(new java.awt.Dimension(241, 241));

        jTinsuarance_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTinsuarance_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTinsuarance_d.setText("00.00");

        jTinsuarance_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTinsuarance_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTinsuarance_c.setText("00.00");

        jLlease_interest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLlease_interest.setText("Lease interest");
        jLlease_interest.setPreferredSize(new java.awt.Dimension(241, 241));

        jTlease_interest_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTlease_interest_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTlease_interest_d.setText("00.00");

        jTlease_interest_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTlease_interest_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTlease_interest_c.setText("00.00");

        jLclosing_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLclosing_stock.setText("Closing stock");
        jLclosing_stock.setPreferredSize(new java.awt.Dimension(241, 241));

        jTclosing_stock_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTclosing_stock_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTclosing_stock_d.setText("00.00");

        jTclosing_stock_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTclosing_stock_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTclosing_stock_c.setText("00.00");

        jLsundries.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLsundries.setText("Sundries expenses");
        jLsundries.setPreferredSize(new java.awt.Dimension(241, 241));

        jTsundries_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTsundries_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTsundries_d.setText("00.00");

        jTsundries_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTsundries_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTsundries_c.setText("00.00");

        jLstaff_foods.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLstaff_foods.setText("Staff foods");
        jLstaff_foods.setPreferredSize(new java.awt.Dimension(241, 241));

        jTstaff_foods_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTstaff_foods_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTstaff_foods_d.setText("00.00");

        jTstaff_foods_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTstaff_foods_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTstaff_foods_c.setText("00.00");

        jLdepreciation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLdepreciation.setText("Depreciation");
        jLdepreciation.setPreferredSize(new java.awt.Dimension(241, 241));

        jTdepreciation_d.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTdepreciation_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTdepreciation_d.setText("00.00");

        jTdepreciation_c.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTdepreciation_c.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTdepreciation_c.setText("00.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLelectrcity, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTelectricity_d, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTelectricity_c, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLepf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLetf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTetf_d, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLstationary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLaccountancy, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLproperty, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLclosing_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTclosing_stock_d, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTclosing_stock_c, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLdepreciation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTdepreciation_d, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTdepreciation_c))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLpurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(10, 10, 10))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLsales, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTpurchase_d, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTpurchase_c, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTsales_d, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTsales_c, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addComponent(jLabel156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLsalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTepf_d, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jTsalary_d))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTetf_c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jTsalary_c, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTepf_c, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLtravelling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLrepair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLbank_charges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jTrepair_d, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTbank_charges_d, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addComponent(jTtravelling_d)
                                            .addComponent(jTrent_d)
                                            .addComponent(jTstationary_d)
                                            .addComponent(jTaccountancy_d))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTtravelling_c)
                                    .addComponent(jTrepair_c)
                                    .addComponent(jTrent_c)
                                    .addComponent(jTstationary_c, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jTaccountancy_c)
                                    .addComponent(jTbank_charges_c)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLtelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLwater, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTwater_d, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTtelephone_d, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTwater_c, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jTtelephone_c))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLstaff_foods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTstaff_foods_d, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTstaff_foods_c))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLsundries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTsundries_d, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTsundries_c))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLlease_interest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTlease_interest_d, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTlease_interest_c))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLinsuarance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTinsuarance_d, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTinsuarance_c))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLopening_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTopening_stock_d, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTopening_stock_c))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLtrade_debtor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLbank_loan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLbank_loan_inter, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLtrade_creditors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTbank_balance_d, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTbank_balance_c, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTbank_loan_d, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                            .addComponent(jTtrade_debtors_d, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTtrade_creditors_d)
                                            .addComponent(jTbank_loan_inter_d))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTtrade_creditors_c, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(jTtrade_debtors_c)
                                            .addComponent(jTbank_loan_c)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLcash_in_hand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLbank_balance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLbank_od, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTbank_od_d)
                                        .addGap(151, 151, 151))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTproperty_d, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTcash_in_hand_d))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTcash_in_hand_c, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jTproperty_c, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTexpense_creditors_d, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTexpense_creditors_c))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLdrawings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLexpense_creditors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLcapital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTdrawings_d, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(jTcapital_d))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTdrawings_c)
                                    .addComponent(jTcapital_c)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTbank_loan_inter_c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTbank_od_c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel156))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTsales_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTsales_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLsales, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTpurchase_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpurchase_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTsalary_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTsalary_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTepf_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTepf_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLepf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTetf_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTetf_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLetf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTelectricity_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTelectricity_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLelectrcity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTwater_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTwater_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLwater, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTtelephone_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTtelephone_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTtravelling_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTtravelling_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtravelling, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTrepair_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTrepair_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLrepair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTrent_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTrent_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLrent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTstationary_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTstationary_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLstationary, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTaccountancy_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTaccountancy_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLaccountancy, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTbank_charges_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTbank_charges_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbank_charges, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTbank_loan_inter_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTbank_loan_inter_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbank_loan_inter, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTtrade_creditors_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTtrade_creditors_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtrade_creditors, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTtrade_debtors_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTtrade_debtors_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtrade_debtor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTbank_loan_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTbank_loan_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbank_loan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTbank_balance_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTbank_balance_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbank_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTbank_od_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTbank_od_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbank_od, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcash_in_hand_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcash_in_hand_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcash_in_hand, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTproperty_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLproperty, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTproperty_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexpense_creditors_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexpense_creditors_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLexpense_creditors, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdrawings_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTdrawings_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLdrawings, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcapital_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcapital_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcapital, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTopening_stock_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTopening_stock_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLopening_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTinsuarance_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTinsuarance_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLinsuarance, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTlease_interest_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTlease_interest_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLlease_interest, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTsundries_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTsundries_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLsundries, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdepreciation_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTdepreciation_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLdepreciation, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTstaff_foods_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTstaff_foods_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLstaff_foods, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTclosing_stock_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTclosing_stock_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLclosing_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        jTline2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTline2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTline1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTline1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTline3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTline3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTline1)
                    .addComponent(jTline2)
                    .addComponent(jTline3))
                .addGap(13, 13, 13))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTline1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTline2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTline3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Trial balance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Profit & loss account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Balance sheet");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(636, 713));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            calTrialbalance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            calProftloss();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            calBalancesheet();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLaccountancy;
    private javax.swing.JLabel jLbank_balance;
    private javax.swing.JLabel jLbank_charges;
    private javax.swing.JLabel jLbank_loan;
    private javax.swing.JLabel jLbank_loan_inter;
    private javax.swing.JLabel jLbank_od;
    private javax.swing.JLabel jLcapital;
    private javax.swing.JLabel jLcash_in_hand;
    private javax.swing.JLabel jLclosing_stock;
    private javax.swing.JLabel jLdepreciation;
    private javax.swing.JLabel jLdrawings;
    private javax.swing.JLabel jLelectrcity;
    private javax.swing.JLabel jLepf;
    private javax.swing.JLabel jLetf;
    private javax.swing.JLabel jLexpense_creditors;
    private javax.swing.JLabel jLinsuarance;
    private javax.swing.JLabel jLlease_interest;
    private javax.swing.JLabel jLopening_stock;
    private javax.swing.JLabel jLproperty;
    private javax.swing.JLabel jLpurchase;
    private javax.swing.JLabel jLrent;
    private javax.swing.JLabel jLrepair;
    private javax.swing.JLabel jLsalary;
    private javax.swing.JLabel jLsales;
    private javax.swing.JLabel jLstaff_foods;
    private javax.swing.JLabel jLstationary;
    private javax.swing.JLabel jLsundries;
    private javax.swing.JLabel jLtelephone;
    private javax.swing.JLabel jLtrade_creditors;
    private javax.swing.JLabel jLtrade_debtor;
    private javax.swing.JLabel jLtravelling;
    private javax.swing.JLabel jLwater;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTaccountancy_c;
    private javax.swing.JTextField jTaccountancy_d;
    private javax.swing.JTextField jTbank_balance_c;
    private javax.swing.JTextField jTbank_balance_d;
    private javax.swing.JTextField jTbank_charges_c;
    private javax.swing.JTextField jTbank_charges_d;
    private javax.swing.JTextField jTbank_loan_c;
    private javax.swing.JTextField jTbank_loan_d;
    private javax.swing.JTextField jTbank_loan_inter_c;
    private javax.swing.JTextField jTbank_loan_inter_d;
    private javax.swing.JTextField jTbank_od_c;
    private javax.swing.JTextField jTbank_od_d;
    private javax.swing.JTextField jTcapital_c;
    private javax.swing.JTextField jTcapital_d;
    private javax.swing.JTextField jTcash_in_hand_c;
    private javax.swing.JTextField jTcash_in_hand_d;
    private javax.swing.JTextField jTclosing_stock_c;
    private javax.swing.JTextField jTclosing_stock_d;
    private javax.swing.JTextField jTdepreciation_c;
    private javax.swing.JTextField jTdepreciation_d;
    private javax.swing.JTextField jTdrawings_c;
    private javax.swing.JTextField jTdrawings_d;
    private javax.swing.JTextField jTelectricity_c;
    private javax.swing.JTextField jTelectricity_d;
    private javax.swing.JTextField jTepf_c;
    private javax.swing.JTextField jTepf_d;
    private javax.swing.JTextField jTetf_c;
    private javax.swing.JTextField jTetf_d;
    private javax.swing.JTextField jTexpense_creditors_c;
    private javax.swing.JTextField jTexpense_creditors_d;
    private javax.swing.JTextField jTinsuarance_c;
    private javax.swing.JTextField jTinsuarance_d;
    private javax.swing.JTextField jTlease_interest_c;
    private javax.swing.JTextField jTlease_interest_d;
    private javax.swing.JTextField jTline1;
    private javax.swing.JTextField jTline2;
    private javax.swing.JTextField jTline3;
    private javax.swing.JTextField jTopening_stock_c;
    private javax.swing.JTextField jTopening_stock_d;
    private javax.swing.JTextField jTproperty_c;
    private javax.swing.JTextField jTproperty_d;
    private javax.swing.JTextField jTpurchase_c;
    private javax.swing.JTextField jTpurchase_d;
    private javax.swing.JTextField jTrent_c;
    private javax.swing.JTextField jTrent_d;
    private javax.swing.JTextField jTrepair_c;
    private javax.swing.JTextField jTrepair_d;
    private javax.swing.JTextField jTsalary_c;
    private javax.swing.JTextField jTsalary_d;
    private javax.swing.JTextField jTsales_c;
    private javax.swing.JTextField jTsales_d;
    private javax.swing.JTextField jTstaff_foods_c;
    private javax.swing.JTextField jTstaff_foods_d;
    private javax.swing.JTextField jTstationary_c;
    private javax.swing.JTextField jTstationary_d;
    private javax.swing.JTextField jTsundries_c;
    private javax.swing.JTextField jTsundries_d;
    private javax.swing.JTextField jTtelephone_c;
    private javax.swing.JTextField jTtelephone_d;
    private javax.swing.JTextField jTtrade_creditors_c;
    private javax.swing.JTextField jTtrade_creditors_d;
    private javax.swing.JTextField jTtrade_debtors_c;
    private javax.swing.JTextField jTtrade_debtors_d;
    private javax.swing.JTextField jTtravelling_c;
    private javax.swing.JTextField jTtravelling_d;
    private javax.swing.JTextField jTwater_c;
    private javax.swing.JTextField jTwater_d;
    // End of variables declaration//GEN-END:variables
}
