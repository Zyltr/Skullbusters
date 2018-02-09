import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
/*
 * Created by JFormDesigner on Sun Jan 28 21:23:50 PST 2018
 */

public class AboutDialog extends JDialog
{
    public AboutDialog ( Window owner )
    {
        super ( owner );
        initComponents ();
    }

    private void initComponents ()
    {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Erik Huerta
        JPanel bulldogPanel = new JPanel ();
        JLabel bulldogLabel = new JLabel ();
        JLabel createdLabel = new JLabel ();
        JLabel memberLabel = new JLabel ();
        JLabel memberLabel2 = new JLabel ();
        JLabel memberLabel3 = new JLabel ();
        JLabel memberLabel4 = new JLabel ();
        JLabel memberLabel5 = new JLabel ();

        //======== this ========
        setTitle ( "About Skullbusters" );
        setName ( "aboutDialog" );
        setResizable ( false );
        setModal ( true );
        Container contentPane = getContentPane ();

        //======== bulldogPanel ========
        {
            bulldogPanel.setBackground ( Color.white );
            bulldogPanel.setBorder ( new BevelBorder ( BevelBorder.RAISED ) );

            //---- bulldogLabel ----
            bulldogLabel.setIcon ( new ImageIcon ( "/Users/Erik/IdeaProjects/Skullbusters/src/Images/Bulldog.jpg" ) );
            bulldogLabel.setHorizontalAlignment ( SwingConstants.CENTER );

            GroupLayout bulldogPanelLayout = new GroupLayout ( bulldogPanel );
            bulldogPanel.setLayout ( bulldogPanelLayout );
            bulldogPanelLayout.setHorizontalGroup ( bulldogPanelLayout.createParallelGroup ().addGroup ( bulldogPanelLayout.createSequentialGroup ().addGap ( 15, 15, 15 ).addComponent ( bulldogLabel ).addGap ( 15, 15, 15 ) ) );
            bulldogPanelLayout.setVerticalGroup ( bulldogPanelLayout.createParallelGroup ().addGroup ( GroupLayout.Alignment.TRAILING, bulldogPanelLayout.createSequentialGroup ().addGap ( 15, 15, 15 ).addComponent ( bulldogLabel ).addGap ( 15, 15, 15 ) ) );
        }

        //---- createdLabel ----
        createdLabel.setText ( "Created By " );
        createdLabel.setFont ( createdLabel.getFont ().deriveFont ( createdLabel.getFont ().getStyle () | Font.BOLD, createdLabel.getFont ().getSize () + 3f ) );
        createdLabel.setHorizontalAlignment ( SwingConstants.CENTER );

        //---- memberLabel ----
        memberLabel.setText ( "Sean McCullough" );
        memberLabel.setFont ( memberLabel.getFont ().deriveFont ( Font.BOLD | Font.ITALIC ) );
        memberLabel.setHorizontalAlignment ( SwingConstants.CENTER );

        //---- memberLabel2 ----
        memberLabel2.setText ( "Ryan Tang" );
        memberLabel2.setFont ( memberLabel2.getFont ().deriveFont ( Font.BOLD | Font.ITALIC ) );
        memberLabel2.setHorizontalAlignment ( SwingConstants.CENTER );

        //---- memberLabel3 ----
        memberLabel3.setText ( "Erik Huerta" );
        memberLabel3.setFont ( memberLabel3.getFont ().deriveFont ( Font.BOLD | Font.ITALIC ) );
        memberLabel3.setHorizontalAlignment ( SwingConstants.CENTER );

        //---- memberLabel4 ----
        memberLabel4.setText ( "Eric Rensel" );
        memberLabel4.setFont ( memberLabel4.getFont ().deriveFont ( Font.BOLD | Font.ITALIC ) );
        memberLabel4.setHorizontalAlignment ( SwingConstants.CENTER );

        //---- memberLabel5 ----
        memberLabel5.setText ( "Yuan Kun Chen (Erik)" );
        memberLabel5.setFont ( memberLabel5.getFont ().deriveFont ( Font.BOLD | Font.ITALIC ) );
        memberLabel5.setHorizontalAlignment ( SwingConstants.CENTER );

        GroupLayout contentPaneLayout = new GroupLayout ( contentPane );
        contentPane.setLayout ( contentPaneLayout );
        contentPaneLayout.setHorizontalGroup ( contentPaneLayout.createParallelGroup ().addGroup ( contentPaneLayout.createSequentialGroup ().addGroup ( contentPaneLayout.createParallelGroup ().addGroup ( contentPaneLayout.createSequentialGroup ().addGap ( 135, 135, 135 ).addComponent ( bulldogPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE ).addGap ( 0, 123, Short.MAX_VALUE ) ).addGroup ( contentPaneLayout.createSequentialGroup ().addContainerGap ().addComponent ( createdLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) ).addGroup ( contentPaneLayout.createSequentialGroup ().addContainerGap ().addComponent ( memberLabel, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE ) ).addComponent ( memberLabel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE ).addGroup ( contentPaneLayout.createSequentialGroup ().addContainerGap ().addComponent ( memberLabel3, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE ) ).addGroup ( contentPaneLayout.createSequentialGroup ().addContainerGap ().addComponent ( memberLabel4, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE ) ).addGroup ( contentPaneLayout.createSequentialGroup ().addContainerGap ().addComponent ( memberLabel5, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE ) ) ).addContainerGap () ) );
        contentPaneLayout.setVerticalGroup ( contentPaneLayout.createParallelGroup ().addGroup ( contentPaneLayout.createSequentialGroup ().addGap ( 20, 20, 20 ).addComponent ( bulldogPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE ).addGap ( 18, 18, 18 ).addComponent ( createdLabel ).addGap ( 18, 18, 18 ).addComponent ( memberLabel ).addPreferredGap ( LayoutStyle.ComponentPlacement.RELATED ).addComponent ( memberLabel2 ).addPreferredGap ( LayoutStyle.ComponentPlacement.RELATED ).addComponent ( memberLabel3 ).addPreferredGap ( LayoutStyle.ComponentPlacement.RELATED ).addComponent ( memberLabel4 ).addPreferredGap ( LayoutStyle.ComponentPlacement.RELATED ).addComponent ( memberLabel5 ).addContainerGap ( 22, Short.MAX_VALUE ) ) );
        pack ();
        setLocationRelativeTo ( getOwner () );

        //---- bindings ----
        bindingGroup = new BindingGroup ();
        bindingGroup.addBinding ( Bindings.createAutoBinding ( UpdateStrategy.READ_WRITE, this, BeanProperty.create ( "preferredSize" ), this, BeanProperty.create ( "minimumSize" ) ) );
        bindingGroup.bind ();
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Erik Huerta
    private BindingGroup bindingGroup;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
