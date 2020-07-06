
PImage rainbow;
PImage unicorn;
void setup() {
  rainbow = loadImage("rainbow_.jpg");
size(800, 600);
rainbow.resize(width,height);
 unicorn = loadImage("unicorn.png");
}

void draw() {
  background(rainbow);
  if(mousePressed){
  image(unicorn,150,50);
  }
  
}
