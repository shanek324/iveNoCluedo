package softwareEngineering2;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Scanner;

import javax.swing.*;


	
	public class FrameTest extends JPanel{
		
		private static final int RED_BORDER_THICKNESS = 3;
		private final Color Red = new Color(255,0,0);
		JFrame frame;
		static final int squareDimension =26;
		static JButton squares[][] = new JButton[squareDimension][squareDimension];
		
		public FrameTest() {
		    frame = new JFrame("Cluedo");
		    frame.setLayout(new GridLayout(squareDimension, squareDimension));
		    frame.setSize(600, 600);
		    //frame.addMouseListener(this);
		   // frame.add(board);
		    assignSquareColour();
		    addPlayerImage();
		    borderKitchen();
		    borderDiningRoom();
		    borderLounge();
		    borderHall();
		    borderStudy();
		    borderLibrary();
		    borderBilliardRoom();
		    borderConservatory();
		    borderBallRoom();
		    borderCentral();
		    
		    //textKitchen();
		   // JPanel kitchen[][] = new JPanel[6][6];
		//    frame.add(new JLabel(new ImageIcon("cluedo board.jpg")));;
		   // frame.add(board);
		   
		    
		 
		    for (int i = 0; i < squareDimension; i++) {
		        for (int j = 0; j < squareDimension; j++) {
		        	 frame.add(squares[i][j]);
			          
		        }
		    }
		    
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		    
		    
		   
		}

		

		public static void main(String[] args) {
		    new FrameTest();
		    testMove();
		}
		
		public void assignSquareColour() {
			   for (int i = 0; i < squareDimension; i++) {
			        for (int j = 0; j < squareDimension; j++) {
			            squares[i][j] = new JButton();
			            squares[i][j].setBorder(BorderFactory.createEmptyBorder());
			            if (i <1 || j < 2 || i >= squareDimension -1 || j >= squareDimension -2) {
			                squares[i][j].setBackground(Color.green);
			            } 
			            if(i == 1) {
			            	if (j == 10 || j == squareDimension -12) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	}
			            	 else {
					                squares[i][j].setBackground(Color.green);
					            }   
			            }
			            if(i == 2) {
			            	if (j >= 8 && j <=10 || j >= squareDimension - 12 && j <=squareDimension - 10) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            	if (j == 7 || j == squareDimension -9 ) {
			            		squares[i][j].setBackground(Color.green);
			            	}
			            	if (j == 6 || j == squareDimension -3 ) {
			            		squares[i][j].setBackground(Color.black);
			            	}
			            }
			            if(i >=3 && i <= 5) {
			            	if (j >= 7 && j <=8 || j >= squareDimension - 10 && j <=squareDimension - 9) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            	
			            }
			            
			            if(i == 6 ) {
			            	if (j >= 7 && j <=8 || j >= squareDimension - 10 && j <=squareDimension - 8) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if(i == 7 ) {
			            	if (j >= 7 && j <=8 || j >= squareDimension -10 && j <=squareDimension - 2) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if(i == 8 ) {
			            	if (j >= 1 && j <=8 || j >= squareDimension - 10 && j <=squareDimension - 3) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if(i == 9 ) {
			            	if (j >= 2 && j <=squareDimension - 8) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if(i == 10) {
			            	if (j >= 6 && j <=squareDimension - 8) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if(i >= 11 && i <= 13 || i == 15) {
			            	if (j >= 9 && j <=10 || j >= squareDimension -10 && j <=squareDimension -8) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if(i == 14) {
			            	if (j >= 9 && j <=10 || j >= squareDimension -10 && j <=squareDimension -3) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if (i == 16) {
			            	if (j >= 9 && j <=10 || j >= squareDimension -10 && j <=squareDimension -9) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if (i == 17) {
			            	if (j >= 2 && j <=10 || j >= squareDimension -10 && j <=squareDimension -9) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if (i == 18) {
			            	if (j >= 1 && j <=squareDimension -9) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if (i == 19) {
			            	if (j >= 2 && j <=9 || j >= squareDimension -10 && j <=squareDimension -8) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if (i == 20) {
			            	if (j >= 8 && j <=9 || j >= squareDimension -10 && j <=squareDimension -2) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if (i == 21) {
			            	if (j >= 8 && j <=9 || j >= squareDimension -10 && j <=squareDimension -3) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if (i >=22 && i<= 23) {
			            	if (j >= 8 && j <=9 || j >= squareDimension -10 && j <=squareDimension -9) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            }
			            if (i == 24) {
			            	if (j >= 8 && j <=9 || j >= squareDimension -10 && j <=squareDimension -9) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            	if (j == 2 || j == squareDimension -3 ) {
			            		squares[i][j].setBackground(Color.black);
			            	}
			            }
			            if (i == 25) {
			            	if (j ==8 || j == squareDimension -9) {
			            		squares[i][j].setBackground(Color.yellow);
			            		squares[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
			            	} 
			            	
			            }
			            
			            
			        }
			    }
		   }
	
		    
	
	
		
		private void addPlayerImage() {
			ImageIcon mrsWhite = new ImageIcon("mrsWhite.png");
			 for (int i = 0; i < squareDimension; i++) {
			        for (int j = 0; j < squareDimension; j++) {
			            if (i == 1 && j == 10) {
			            	// squares[i][j] = new JButton(mrsWhite);
			            	 squares[i][j].add(new JTextArea("W"));
			            	 
			            }
			           
			        }
			 }
		}
		
		
		private void borderKitchen() {
			 for (int i = 0; i < squareDimension; i++) {
			        for (int j = 0; j < squareDimension; j++) {
			            if (i ==2) {
			            	if(j == 2) {
			            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
				            }
			            	if(j== 6) {				            
				            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
				            }
			            	if(j > 2 && j < 6) {
				            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
				            }
			            }
			            
			            if (i >= 3 && i<7 && j == 2) {
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
			            if (i >= 3 && i<7 && j == 6) {
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			            }
			            if (i==7) {
			            	if(j== 2) {
			            		squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, Red));
			            	}
			            	if(j==3 || j == 4) {
			            		squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, 0, Red));
			              	}
			            	if(j== 6) {
			            		squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, Red));
			            	}
			            }
			        }
			 	}
			}
		
		
		private void borderDiningRoom() {
			for (int i = 0; i < squareDimension; i++) {
				for (int j = 0; j < squareDimension; j++) {
					if (i ==10) {
		            	if(j >= 3 && j<=4) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
			            }
		            	if(j== 2) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
		            	if(j== 5) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
			            }       
					}
					if (i ==11) {
						if(j== 2) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
					    if(j >= 6 && j<=7) {
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
				        }
					    if(j== 8) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
			            }
		            }
					if (i ==12 || (i>=14 && i <=15)) {
						if(j== 2) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
						if(j== 8) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			            }
					}
					if (i ==13) {
						if(j== 2) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
					}
					if (i ==16) {
						if(j>= 3 && j<= 6 ) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, 0, Red));
			            }
						if(j== 2) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, Red));
			            }
						if(j== 8) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, Red));
			            }
					}
				}
		 	}
		}

	
		private void borderLounge() {
			for (int i = 0; i < squareDimension; i++) {
				for (int j = 0; j < squareDimension; j++) {
					if (i ==20) {
		            	if(j >= 3 && j<=6) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
			            }
		            	if(j== 2) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
		            	if(j== 7) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			            } 
					} 	
		            if (i >=21 && i <= 23) {
			           	if(j== 2) {				            
				           	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
			           	}
			          	if(j== 7) {				            
				           	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			          	}
		            }	
		            if (i ==24) {
		            	if(j >= 3 && j<=6) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, 0, Red));
			            }
		            	if(j== 2) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, Red));
			            }
		            	if(j== 7) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, Red));
			            } 
					} 	
				}
		 	}
		}

		
		private void borderHall() {
			for (int i = 0; i < squareDimension; i++) {
				for (int j = 0; j < squareDimension; j++) {
					if (i ==19) {
		            	if(j == 11 || j==14) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
			            }
		            	if(j== 10) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
		            	if(j== 15) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
			            } 
					} 	
					if (i ==20) {
						if(j== 10) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
					}
		            if (i ==21 || ( i >= 22 && i<= 23)) {
			           	if(j== 10) {				            
				           	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
			           	}
			          	if(j== 15) {				            
				           	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			          	}
		            }	
		            if (i ==24) {
		            	if(j >= 11 && j<=14) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, 0, Red));
			            }
		            	if(j== 10) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0,Red));
			            }
		            	if(j== 15) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, Red));
			            } 
					} 	
				}
		 	}
		}
		
	
		private void borderStudy() {
			for (int i = 0; i < squareDimension; i++) {
				for (int j = 0; j < squareDimension; j++) {
					if (i ==22) {
		            	if(j >= 19 && j<=22) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0,Red));
			            }
		            	if(j == 18) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
		            	}
		            	if(j == 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
		            	}
					} 	
					if (i ==23) {
		            	
		            	if(j == 18) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
		            	}
		            	if(j == 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
		            	}
					} 	
					if (i ==24) {
		            	if(j >= 19 && j<=22) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, 0, Red));
			            }
		            	if(j == 18) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, Red));
		            	}
		            	if(j == 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, Red));
		            	}
					} 	
					
				}
		 	}
		}
	
		
		private void borderLibrary() {
			for (int i = 0; i < squareDimension; i++) {
				for (int j = 0; j < squareDimension; j++) {
					if (i ==15) {
		            	if(j ==19) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
		            	if(j== 20 || j == 22) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
			            }
		            	if(j== 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
			            }       
					}
					if (i ==16) {
						if(j== 18) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
					    if(j == 23) {
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
				        }			
		            }
					if (i == 17) {
						if(j== 23) {				            
							squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			            }
						
					}
					if (i ==18) {
						if(j== 18) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, Red));
			            }
						if(j== 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			            }
					}
					if (i ==19) {
						if(j == 19 ) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, Red));
			            }
						if(j>= 20 && j <= 22) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, 0,Red));
			            }
						if(j== 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, Red));
			            }
					}
				}
		 	}
		}

		
		private void borderBilliardRoom() {
			for (int i = 0; i < squareDimension; i++) {
				for (int j = 0; j < squareDimension; j++) {
					if (i ==9) {
		            	if(j ==19) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
		            	if(j>= 20 && j <= 22) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
			            }
		            	if(j== 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
			            }       
					}
					if (i == 10) {
						if(j== 23) {				            
							squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			            }
						
					}
					if (i ==11 || i ==12) {
		            	if(j ==19) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0,Red));
			            }
		            	
		            	if(j== 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			            }       
					}
					
					if (i ==13) {
						if(j == 19 ) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, Red));
			            }
						if(j>= 20 && j <= 22) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, 0, Red));
			            }
						if(j== 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, Red));
			            }
					}
				}
		 	}
		}

		
		private void borderConservatory() {
			for (int i = 0; i < squareDimension; i++) {
				for (int j = 0; j < squareDimension; j++) {
					if (i ==2) {
		            	if(j ==18) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
		            	if(j>= 19 && j <= 22) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
			            }
		            	if(j== 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
			            }       
					}
					if (i >=3 && i<=4) {
						if(j ==18) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0,Red));
			            }
						if(j== 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			            }
						
					}
					if (i ==5) {
						if(j ==18) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0,Red));
			            }
						if(j== 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			            }
		          
					}
					
					if (i ==6) {
						if(j == 19 ) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, Red));
			            }
						if(j>= 20 && j <= 22) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, 0, Red));
			            }
						if(j== 23) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, Red));
			            }
					}
				}
		 	}
		}
	
	
	
		private void borderBallRoom() {
			for (int i = 0; i < squareDimension; i++) {
				for (int j = 0; j < squareDimension; j++) {
					if (i ==2) {
		            	if(j == 12) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
			            }
		            	if(j== 11) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
		            	if(j== 13) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
			            } 
					} 	
					if (i ==3) {
		            	if(j == 10 || j == 14) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
			            }
		            	if(j== 9) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
		            	if(j== 15) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
			            } 
					} 	
		            if (i ==7 || ( i >= 4 && i<= 5)) {
			           	if(j== 9) {				            
				           	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
			           	}
			          	if(j== 15) {				            
				           	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			          	}
		            }	
		            if (i ==8) {
		            	if(j >= 11 && j<=13) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, 0, Red));
			            }
		            	if(j== 9) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0,Red));
			            }
		            	if(j== 15) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, Red));
			            } 
					} 	
				}
		 	}
		}
		
		private void borderCentral() {
			for (int i = 0; i < squareDimension; i++) {
				for (int j = 0; j < squareDimension; j++) {
					if (i ==11) {
		            	if(j >= 12 && j<=14) {
		            		squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, 0, Red));
			            }
		            	if(j== 11) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
		            	if(j== 15) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(RED_BORDER_THICKNESS, 0, 0, RED_BORDER_THICKNESS, Red));
			            } 
					} 	
					if (i >=12 && i <=16) {
						if(j== 11) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, 0, 0, Red));
			            }
						if(j== 15) {				            
			            	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, 0, RED_BORDER_THICKNESS, Red));
			            } 
					}
		            if (i == 17) {
			           	if(j== 11) {				            
				           	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, 0, Red));
			           	}
			 		           	
			          	if(j== 15) {				            
				           	squares[i][j].setBorder(BorderFactory.createMatteBorder(0, 0, RED_BORDER_THICKNESS, RED_BORDER_THICKNESS, Red));
			          	}
		            }	
		            
				}
		 	}
		}
	
		private void textKitchen() {
			JPanel kitchen = new JPanel();
			JTextArea Kitchen = new JTextArea("KITCHEN");
			kitchen.add(Kitchen);
			frame.add(kitchen);
		}
	
		
		private static void testMove() {
			System.out.println("Please enter direction you want to move");
			Scanner myScanner = new Scanner(System.in);
			String move = myScanner.next();
			if(move == "D") {
				squares[2][10] = squares[1][10];
			}
			
		}
	}