 import java.awt. *;
 import javax.swing. *;
    
    public class CalculatorPanel extends JPanel
    {
        private JTextField display;
        private JButton[] buttons;
        
        public CalculatorPanel()
        {
            display = new JTextField();
            
            buttons = new JButton[18];
            
            for(int i = 0; i < 10; i++)
            {
                buttons[i] = new JButton("" + i);
            }
        buttons[10] = new JButton(".");
        buttons[11] = new JButton("+"); 
        buttons[12] = new JButton("-");
        buttons[13] = new JButton("*");
        buttons[14] = new JButton("/");
        buttons[15] = new JButton("C");
        buttons[16] = new JButton("=");
        buttons[17] = new JButton("x^y");
        
        createDisplay();
        Controls control = new Controls(display, buttons);
    
    }
    
    public void createDisplay()
    {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.ipadx = 20;
        c.ipady = 50;
        
        c.gridy = 0;
        c.gridx = 0;
        c.gridwidth = 5;
        add(display, c);
        
        c.gridy = 4;
        c.gridwidth = 2;
        add(buttons[0], c);
        
        
        c.gridwidth = 1;
        c.gridy = 1;
        add(buttons[1], c);
        
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        add(buttons[2], c);
        
        c.gridy = 1;
        c.gridx = 2;
        add(buttons[3], c);
        
        c.gridy = 2;
        c.gridx = 0;
        c.gridwidth = 1;
        add(buttons[4], c);
        
        c.gridy = 2;
        c.gridx = 1;
        c.gridwidth = 1;
        add(buttons[5], c);
        
        c.gridy = 2;
        c.gridx = 2;
        add(buttons[6], c);
        
        c.gridy = 3;
        c.gridx = 0;
        c.gridwidth = 1;
        add(buttons[7], c);
        
        c.gridy = 3;
        c.gridx = 1;
        c.gridwidth = 1;
        add(buttons[8], c);
        
        c.gridy = 3;
        c.gridx = 2;
        add(buttons[9], c);
        
        c.gridy = 4;
        add(buttons[10], c);
        
        c.gridx = 3;
        c.gridy = 1;
        add(buttons[11], c);
        
        c.gridy = 2;
        add(buttons[12], c);
        
        c.gridy = 3;
        add(buttons[13], c);
        
        c.gridy = 4;
        add(buttons[14], c);
        
        c.gridx = 4;
        c.gridy = 1;
        c.gridheight = 2;
        add(buttons[15], c);
        
        c.gridy = 3;
        add(buttons[16], c);
       
        c.gridy = 6;
        c.gridx = 0;
        c.gridwidth = 10;
        add(buttons[17], c);
        
        
        
        
        
        
        
        
        
        
        
    
    
    }
    
}

