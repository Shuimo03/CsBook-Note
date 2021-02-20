#pragma once
#include"MapSite.h"
#include"Room.h"
/*
描述一个房间的每一面所出现的墙壁或门
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

