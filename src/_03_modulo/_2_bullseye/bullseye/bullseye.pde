
void setup() {
 
  // set the size of your sketch
  size(500, 500);
}

void draw() {
  //#FF1515 red
  //#030000 black
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  fill(#FF1515);
  ellipse(250, 250, 400, 400);
  fill(#030000);
  ellipse(250, 250, 350, 350);
  fill(#FF1515);
  ellipse(250, 250, 300, 300);
  fill(#030000);
  ellipse(250, 250, 250, 250);
  fill(#FF1515);
  ellipse(250, 250, 200, 200);
  fill(#030000);
  ellipse(250, 250, 150, 150);
  fill(#FF1515);
  ellipse(250, 250, 100, 100);
  fill(#030000);
  ellipse(250, 250, 50, 50);
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
