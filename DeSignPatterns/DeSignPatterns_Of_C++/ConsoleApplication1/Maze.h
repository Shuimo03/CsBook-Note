#pragma once
#include "Room.h"
/*
	������ʾ���伯�ϵ��࣬ʹ��RoomNo�����͸�������ţ�Maze�Ϳ����ҵ�һ���ض��ķ���
*/
class Maze
{
public:
	Maze();

	void AddRoom(Room*);
	Room* RoomNo(int) const;

};
