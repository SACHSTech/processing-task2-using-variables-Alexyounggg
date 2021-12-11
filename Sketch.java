import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
	    background(255,250,250);
	    
	    // White background
	    noStroke();
	    fill(40, 50, 200);
	    rect(0, 0, width, height/2);
	    
	    stroke(0);
	  }

	  /**
	   * Called repeatedly, anything drawn to the screen goes here
	   */
	  public void draw() {
		  
		  // Bottom snow ball
		  fill(255,250,250);
		  ellipse(width/2, height/2, (float) (width * 0.375), (float) (height * 0.375));
		  
		  // Middle snow ball
		  fill(255,250,250);
		  ellipse(width/2, height/4, width/4, height/4);
		  
		  // Top snow ball
		  fill(255,250,250);
		  ellipse(width/2, height/8, (float) (width * 0.1875), (float) (height * 0.1875));
		  
		  // Left eye
		  fill(0,0,0);
		  ellipse((float) (width * 0.475), height/10, width/80, height/80);
		  
		  // Right eye
		  fill(0,0,0);
		  ellipse((float) (width * 0.5375), height/10, width/80, height/80);
		  
		  // Bottom button
		  fill(0,0,0);
		  ellipse(width/2, (float) (height * 0.5375), (float) (width * 0.0375), (float) (height * 0.0375));
		  
		  // Middle button 
		  fill(0,0,0);
		  ellipse(width/2, (float) (height * 0.45), (float) (width * 0.0375), (float) (height * 0.0375));
		  
		  // Top button
		  fill(0,0,0);
		  ellipse(width/2, (float) (height * 0.275), (float) (width * 0.0375), (float) (height * 0.0375));
		  
		  // Smile 
		  fill(0,0,0);
		  arc(width/2, height/8, width/40, height/40, 0, PI); 
		  
		  // Sun
		  fill(255,255,0);
		  ellipse((float) (width * 0.975), height/40, width/8, height/8);
		  
		  // Left arm
		  line(width/8, height/8, (float) (width * 0.375), height/4);
		  
		  // Right arm
		  line((float) (height * 0.625), height/4, (float) (width * 0.875), height/8);
		  
		  
		 
	  }
	  
	  
	  
	}