#pragma once
#include"MapSite.h"
#include"Room.h"
/*
����һ�������ÿһ�������ֵ�ǽ�ڻ���
*/
class Wall
{
public:
	Wall();

	virtual void Enter();
};

class Door : public MapSite {

public:
	Door(Room* = 0, Room* = 0);

	virtual void Enter();

	Room* OtherSideFrom(Room*);

private:
	Room* _room1;
	Room* _room2;
	bool _isOpen;
};

