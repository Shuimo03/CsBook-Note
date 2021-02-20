#pragma once
#include "Room.h"
/*
	用来表示房间集合的类，使用RoomNo操作和给定房间号，Maze就可以找到一个特定的房间
*/
class Maze
{
public:
	Maze();

	void AddRoom(Room*);
	Room* RoomNo(int) const;

};
