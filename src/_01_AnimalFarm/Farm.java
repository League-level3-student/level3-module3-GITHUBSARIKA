package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm extends Animal{
public static void main(String[] args) {
	ArrayList<Animal> farm=new ArrayList<Animal>();
	Cow cow=new Cow();
	Pig pig=new Pig();
	Rooster rooster=new Rooster();
	Sheep sheep=new Sheep();
	farm.add(sheep);
	farm.add(rooster);
farm.add(pig);
farm.add(cow);
farm.add(sheep);
farm.add(cow);
for (int i = 0; i < farm.size(); i++) {
	Animal a = farm.get(i);
	a.makeNoise();
	  
}
}

@Override
void makeNoise() {
	// TODO Auto-generated method stub
	
}
}
