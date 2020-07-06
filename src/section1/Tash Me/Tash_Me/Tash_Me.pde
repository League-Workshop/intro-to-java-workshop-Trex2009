PImage mustache;
PImage friend;
void setup() {

  friend = loadImage("Face.png");
  size(800, 600);
  friend.resize(width, height);
  mustache = loadImage("Mustache.png");
  mustache.resize(150,100);
}

void draw() {
  background(friend);
 if(mousePressed){
   image(mustache,320,340);
 }
  
}
