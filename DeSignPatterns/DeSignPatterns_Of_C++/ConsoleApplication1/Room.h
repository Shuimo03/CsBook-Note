#pragma once
#include "MapSite.h"
#include "Direction.h"

/**
	Room是MapSite的具体子类，指向其他MapSite对象的引用，并且保存一个房间号
	这个数字用来表示迷宫中的房间
*/

class Room : public MapSite
{
public:
	Room(int roomNo);
	MapSite* GetSide(direction) const;
	void SetSide(direction, MapSite*);

	virtual void Enter();

private:
	MapSite* _sides[4];
	int _roomNumber;
};

