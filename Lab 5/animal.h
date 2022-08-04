#include <iostream>
#include <string>
using namespace std;
enum COLOR { Green, Blue, White, Black, Brown };
class Animal {
public:
	Animal() : _name("unknown") {
		cout << "constructing Animal object " << _name << endl;
	}
	Animal(string n, COLOR c) : _name(n), _color(c)
	{
		cout << "constructing Animal object " << _name << " of color ";

		switch (c)
		{
			case Green:
				cout << "Green" << endl;
				break;
			case Blue:
				cout << "Blue" << endl;
				break;
			case White:
				cout << "White" << endl;
				break;
			case Black:
				cout << "Black" << endl;
				break;
			case Brown:
				cout << "Brown" << endl;
				break;
		
		}
	}
	~Animal() {
		cout << "destructing Animal object " << _name << endl;
	}
	virtual void speak(){
		cout << "Animal speaks " << endl;
	}
	virtual void move() = 0;
	string getName()
	{
		return _name;
	}
	COLOR getColor()
	{
		return _color;
	}
private:
	string _name;
	COLOR _color;
};

class Mammal : public Animal
{
public:
	Mammal() : Animal() {
		cout << "constructing Mammal object " << Animal::getName() << endl;
	}
	Mammal(string n, COLOR c) : Animal(n, c)
	{
		cout << "constructing Mammal object " << Animal::getName() << " of color ";

		switch (Animal::getColor())
		{
		case Green:
			cout << "Green" << endl;
			break;
		case Blue:
			cout << "Blue" << endl;
			break;
		case White:
			cout << "White" << endl;
			break;
		case Black:
			cout << "Black" << endl;
			break;
		case Brown:
			cout << "Brown" << endl;
			break;

		}
	}
	~Mammal() {
		cout << "destructing Mammal object " << Animal::getName() << endl;
	}
	void eat() const {
		cout << "Mammal eat " << endl;
	}
	virtual void move()
	{
		cout << "Mammal move " << endl;
	}

};