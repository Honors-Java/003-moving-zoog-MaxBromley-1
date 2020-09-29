void setup() {
	size(300, 300);
}

void draw() {
	 // Draw a white background
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);

  background(200);
  // Set CENTER mode
  ellipseMode(CENTER);
  rectMode(CENTER);
  // Draw Zoog's body
  stroke(0);
  fill(255,mouseX,mouseY);
  rect(mouseX, mouseY,20,100);
  // Draw Zoog's head
  stroke(0);
  fill(mouseX,255,mouseY);
  ellipse(mouseX, mouseY - 30,60,60);
  // Draw Zoog's eyes
  fill(mouseX,mouseY,255);

  // remove the forward slashes in front of each line of code below one at a time. Remove the underline and replace with the proper code to allow your mouse to move Zoog around  💻

  ellipse(mouseX -10,mouseY -20,16,32);
  ellipse(mouseX +10, mouseY-20,16,32);
  // Draw Zoog's legs
  stroke(0);
  line(mouseX - 10,mouseY + 50,mouseX - 20,mouseY + 70);
  line(mouseX + 10,mouseY+50, mouseX + 20, mouseY + 70);
}