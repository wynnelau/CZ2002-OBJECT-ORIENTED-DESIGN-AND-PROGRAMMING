#include <iostream>
#include <string>
#include "childAnimal.h"
using namespace std;

int main() {

	//Animal a("Dog", Black);
	//a.speak();

	//Mammal b("Cat", Brown);
	//b.speak();

	//Dog c("Golden", White, "Jack");
	//c.speak();
	//c.move();

	//Animal* animalPtr = new Dog("Lassie", White, "Andy");
	//animalPtr->speak();
	//animalPtr->move();
	//delete animalPtr;

	//Dog dogi("Lassie", White, "Andy");
	//Mammal* aniPtr = &dogi;
	//Mammal& aniRef = dogi;
	//Mammal aniVal = dogi;
	//aniPtr->speak();
	//aniRef.speak();
	//aniVal.speak();

	int c = 0;
	Mammal** m = new Mammal * [3];
	m[0] = new Dog();
	m[1] = new Cat();
	m[2] = new Lion();

	while (c != 5)
	{
		cout << "Select the animal to send to Zoo :" << endl;
		cout << "(1) Dog(2) Cat(3) Lion(4) Move all animals(5) Quit" << endl;
		cin >> c;
		switch (c)
		{
			case 1: 
				m[0]->move();
				m[0]->speak();
				m[0]->eat();
				break;

			case 2:
				m[1]->move();
				m[1]->speak();
				m[1]->eat();
				break;

			case 3:
				m[2]->move();
				m[2]->speak();
				m[2]->eat();
				break;

			case 4:
				for (int i = 0; i < 3; i++) {
					m[i]->move();
					m[i]->speak();
					m[i]->eat();
				}
				break;
			default: continue;
		}

	}
	cout << "Program exiting ... " << endl;
	return 0;
}