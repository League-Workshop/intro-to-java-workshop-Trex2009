int foodX = 100;
int foodY = 20;

void setup(){
size(600,600);
}

void draw() {
  background(141,233,237);
  fill ( 245, 234, 123);
  noStroke();
  ellipse(foodX,foodY, 15,15);
  foodY += 3;
}
