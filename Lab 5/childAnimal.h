#include <iostream>
#include <string>
#include "animal.h"
using namespace std;

class Dog : public Mammal 
{
public:
	Dog() : Mammal() {
		cout << "constructing Dog object " << Animal::getName() << endl;
	}
	Dog(string n, COLOR c, string o) : Mammal(n, c)
	{
		_owner = o;
		cout << "constructing Dog object " << Animal::getName() << " of color ";

		switch (Animal::getColor())
		{
		case Green:
			cout << "Green";
			break;
		case Blue:
			cout << "Blue";
			break;
		case White:
			cout << "White";
			break;
		case Black:
			cout << "Black";
			break;
		case Brown:
			cout << "Brown";
			break;

		}
		cout << " of owner " << _owner << endl;
	}
	~Dog() {
		cout << "destructing Dog object " << Animal::getName() << endl;
	}
	void speak()
	{
		cout << "Woof " << endl;
	}
	void move()
	{
		cout << "Dog move " << endl;
	}
private:
	string _owner;
};

class Cat : public Mammal
{
public:
	Cat() : Mammal() {
		cout << "constructing Cat object " << Animal::getName() << endl;
	}
	Cat(string n, COLOR c) : Mammal(n, c)
	{
		cout << "constructing Cat object " << Animal::getName() << " of color ";

		switch (Animal::getColor())
		{
		case Green:
			cout << "Green";
			break;
		case Blue:
			cout << "Blue";
			break;
		case White:
			cout << "White";
			break;
		case Black:
			cout << "Black";
			break;
		case Brown:
			cout << "Brown";
			break;

		}
		
	}
	~Cat() {
		cout << "destructing Cat object " << Animal::getName() << endl;
	}
	void speak()
	{
		cout << "Meow " << endl;
	}
	void move()
	{
		cout << "Cat move " << endl;
	}
};

class Lion : public Mammal
{
public:
	Lion() : Mammal() {
		cout << "constructing Lion object " << Animal::getName() << endl;
	}
	Lion(string n, COLOR c) : Mammal(n, c)
	{
		cout << "constructing Lion object " << Animal::getName() << " of color ";

		switch (Animal::getColor())
		{
		case Green:
			cout << "Green";
			break;
		case Blue:
			cout << "Blue";
			break;
		case White:
			cout << "White";
			break;
		case Black:
			cout << "Black";
			break;
		case Brown:
			cout << "Brown";
			break;

		}

	}
	~Lion() {
		cout << "destructing Lion object " << Animal::getName() << endl;
	}
	void speak()
	{
		cout << "Roar " << endl;
	}
	void move()
	{
		cout << "Lion move " << endl;
	}
};