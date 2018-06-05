/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author arcana
 */
public class Calculator extends JFrame {
        private JTextField answerfield;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero;
	private JButton add, sub, multiply, div, equals, clear, decimal, negative, factorial, modulus, root;
	private String stemp1, stemp2, sanswer; // string temporary 1, 2 for 1st and 2nd number
	private double answer = 0.0;
	private JPanel contentPanel;
	private boolean equalsClicked = false; 
        private boolean opChosen = false;
        char operation = ' ';

	public Calculator(){
		this.setTitle("Calculator");

		answerfield = new JTextField(null, 20);
		answerfield. setEditable(false); // so that answerfield cannot be edited

		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		
		add = new JButton("+");
		sub = new JButton("-");
		multiply = new JButton("*");
		div = new JButton("/");
		equals = new JButton("=");
                clear = new JButton("C");
                decimal = new JButton(".");
                negative = new JButton("+/-");
                factorial = new JButton("!");
                modulus = new JButton("%");
                root = new JButton("√");

		// set prefered size

		Numbers n = new Numbers();
		Calc c = new Calc();		

                one.addActionListener(n);
                two.addActionListener(n);
                three.addActionListener(n);
                four.addActionListener(n);
                five.addActionListener(n);
                six.addActionListener(n);
                seven.addActionListener(n);
                eight.addActionListener(n);
                nine.addActionListener(n);
                zero.addActionListener(n);
                decimal.addActionListener(n);
                negative.addActionListener(n);
                
                clear.addActionListener(c);
                add.addActionListener(c);
                sub.addActionListener(c);
                multiply.addActionListener(c);
                div.addActionListener(c);
                equals.addActionListener(c);
                factorial.addActionListener(c);
                modulus.addActionListener(c);
                root.addActionListener(c);

		contentPanel = new JPanel();
		setSize(250, 220);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel.setBackground(Color.ORANGE); // sets color of background to orange
		contentPanel.setLayout(new FlowLayout());
		contentPanel.add(answerfield, BorderLayout.NORTH); //positions the answerfield on the top of the frame

		contentPanel.add(one); contentPanel.add(two); contentPanel.add(three); contentPanel.add(four);
		contentPanel.add(five); contentPanel.add(six); contentPanel.add(seven); contentPanel.add(eight);
		contentPanel.add(nine); contentPanel.add(zero); contentPanel.add(add); contentPanel.add(sub);
		contentPanel.add(multiply); contentPanel.add(div); contentPanel.add(decimal); contentPanel.add(negative);
                contentPanel.add(factorial); contentPanel.add(root); contentPanel.add(clear); contentPanel.add(modulus);
                contentPanel.add(equals);

		this.setContentPane(contentPanel);
	}//end GUI

	private class Numbers implements ActionListener{
                @Override
		public void actionPerformed(ActionEvent event){
		JButton src = (JButton)event.getSource(); //used to see which is the source of the button pushed
		
		if(src.equals(one)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "1";			
				} else{
				   stemp1 = stemp1 + "1";
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "1";
				} else {
					stemp2 = stemp2 + "1";
				}
			} // end else op chosen

		} // end if src == one
		
		if(src.equals(two)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "2";			
				} else{
				   stemp1 = stemp1 + "2";
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "2";
				} else {
					stemp2 = stemp2 + "2";
				}
			} // end else op chosen

		} // end if src == two
		
		if(src.equals(three)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "3";			
				} else{
				   stemp1 = stemp1 + "3";
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "3";
				} else {
					stemp2 = stemp2 + "3";
				}
			} // end else op chosen

		} // end if src == three

		if(src.equals(four)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "4";			
				} else{
				   stemp1 = stemp1 + "4";
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "4";
				} else {
					stemp2 = stemp2 + "4";
				}
			} // end else op chosen

		} // end if src == four

		if(src.equals(five)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "5";			
				} else{
				   stemp1 = stemp1 + "5";
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "5";
				} else {
					stemp2 = stemp2 + "5";
				}
			} // end else op chosen

		} // end if src == five

		if(src.equals(six)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "6";			
				} else{
				   stemp1 = stemp1 + "6";
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "6";
				} else {
					stemp2 = stemp2 + "6";
				}
			} // end else op chosen

		} // end if src == six

		if(src.equals(seven)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "7";			
				} else{
				   stemp1 = stemp1 + "7";
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "7";
				} else {
					stemp2 = stemp2 + "7";
				}
			} // end else op chosen

		} // end if src == seven

		if(src.equals(eight)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "8";			
				} else{
				   stemp1 = stemp1 + "8";
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "8";
				} else {
					stemp2 = stemp2 + "8";
				}
			} // end else op chosen

		} // end if src == eight

		if(src.equals(nine)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "9";			
				} else{
				   stemp1 = stemp1 + "9";
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "9";
				} else {
					stemp2 = stemp2 + "9";
				}
			} // end else op chosen

		} // end if src == nine

		if(src.equals(zero)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "0";			
				} else{
				   stemp1 = stemp1 + "0";
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "0";
				} else {
					stemp2 = stemp2 + "0";
				}
			} // end else op chosen

		} // end if src == zero
                if(src.equals(decimal)){ // if the source of the button clicked is one
			if(opChosen == false) { // if they haven't chosen an operation, a string in the from of a number will concocanate
				if(stemp1 == null){
					stemp1 = "0.";			
				} else if(stemp1 != null){
				   if(stemp1.contains(".")){
                                       System.out.println("You already have a decimal point!");
                                   } else {
                                       stemp1 = stemp1 + ".";
                                   }
				} // end else
			} else { 
				if(stemp2 == null){
					stemp2 = "0.";
				} else if(stemp2 != null) {
					if(stemp2.contains(".")){
                                            System.out.println("You already have a decimal point!");
                                        } else {
                                            stemp2 = stemp2 + ".";
                                        }
				}
			} // end else op chosen

		} // end if src == zero
                if(src.equals(negative)){
                    if(opChosen == false) {
                        if(stemp1 == null){
                            stemp1 = "-";
                        } else if (stemp1 != null && stemp1.startsWith("-")){
                            stemp1 = stemp1.substring(1); // makes it basically rewrite itself without the negative
                        }else {
                            stemp1 = "-" + stemp1;
                        }
                    } else {
                        if(stemp2 == null){
                            stemp2 = "-";
                        } else if (stemp2 != null && stemp2.startsWith("-")){
                            stemp2 = stemp2.substring(1);
                        } else{
                            stemp2 = "-" + stemp2;
                        }
                            
                        
                    }
                }
                
                if(equalsClicked == false) {
                    if(opChosen == false) {
                        answerfield.setText(stemp1);
                    } else {
                        answerfield.setText(stemp2);
                    }
                }


	} // end action performed

	} // end action listener
	private class Calc implements ActionListener{
                @Override
		public void actionPerformed(ActionEvent event){
                    JButton src = (JButton) event.getSource();
		
                    
                    if(src.equals(add)){
                        if(stemp1 == null){
                            System.out.println("Choose your numbers first");
                        } else if (stemp1 != null && stemp2 == null){
                            opChosen = true;
                            operation = '+';
                        }else if(stemp1 != null && stemp2 != null){
                            System.out.println("Two operations only!");
                        }
                    }
                     if(src.equals(sub)){
                        if(stemp1 == null){
                            System.out.println("Choose your numbers first");
                        } else if (stemp1 != null && stemp2 == null){
                            opChosen = true;
                            operation = '-';
                        }else if(stemp1 != null && stemp2 != null){
                            System.out.println("Two operations only!");
                        }
                    }
                      if(src.equals(div)){
                        if(stemp1 == null){
                            System.out.println("Choose your numbers first");
                        } else if (stemp1 != null && stemp2 == null){
                            opChosen = true;
                            operation = '/';
                        }else if(stemp1 != null && stemp2 != null){
                            System.out.println("Two operations only!");
                        }
                    }
                       if(src.equals(multiply)){
                        if(stemp1 == null){
                            System.out.println("Choose your numbers first");
                        } else if (stemp1 != null && stemp2 == null){
                            opChosen = true;
                            operation = '*';
                        }else if(stemp1 != null && stemp2 != null){
                            System.out.println("Two operations only!");
                        }
                    }
                       if(src.equals(factorial)){
                        if(stemp1 == null){
                            System.out.println("Choose your numbers first");
                        } else if (stemp1 != null && stemp2 == null){
                            opChosen = true;
                            operation = '!';
                            
                        }
                    }
                       if(src.equals(root)){
                        if(stemp1 == null){
                            System.out.println("Choose your numbers first");
                        } else if (stemp1 != null && stemp2 == null){
                            opChosen = true;
                            operation = 'V';
                            
                        }
                    }
                    if(src.equals(modulus)){
                        if(stemp1 == null){
                            System.out.println("Choose your numbers first");
                        } else if (stemp1 != null && stemp2 == null){
                            opChosen = true;
                            operation = '%';
                        }else if(stemp1 != null && stemp2 != null){
                            System.out.println("Two operations only!");
                        }
                    }
                       
                       
                        if(src.equals(equals)){
                        if(stemp1 == null){
                            System.out.println("Choose your numbers first");
                        } else if (stemp1 != null && stemp2 == null){
                            if(operation == '!'){
                               double fact = Long.parseLong(stemp1);
                               long result = 1;

                                for (long factor = 2; factor <= fact; factor++) {
                                      result *= factor;
                                }
                                sanswer = Long.toString(result);
                                answerfield.setText(sanswer);            
                            } else if (operation == 'V'){
                                double square = Double.parseDouble(stemp1);
                                answer = Math.sqrt(square);
                                sanswer = Double.toString(answer);
                                answerfield.setText(sanswer);
                            }
                        }else if(stemp1 != null && stemp2 != null){
                            double d1 = 0.0, d2 = 0.0;
                            
                            d1 = Double.parseDouble(stemp1);
                            d2 = Double.parseDouble(stemp2);
                            
                            switch(operation){
                                case '+':
                                    answer = d1 + d2;
                                    break;
                                case '-':
                                    answer = d1 - d2;
                                    break;
                                case '*':
                                    answer = d1 * d2;
                                    break;
                                case '/':
                                    answer = d1 / d2;
                                    break;
                                case '%':
                                    double mod = d1 % d2;
                                    answer = mod;
                               
                                
                            }
                            sanswer = Double.toString(answer);
                            answerfield.setText(sanswer);
                            if(operation == '/' && d2 == 0.0 ){
                                answerfield.setText("DIVIDE BY 0 ERROR");
                            }
                        }
                    }
                    if(src.equals(clear)){
                        stemp1 = null;
                        stemp2 = null;
                        equalsClicked = false;
                        opChosen = false;
                        operation = ' ';
                        answerfield.setText(null);
                        sanswer = null;
                    }
                    
                    
		}
	}




    public static void main(String[] args) {
	
	javax.swing.SwingUtilities.invokeLater(
		() -> new Calculator()
		
	); 	
    }
    
}
