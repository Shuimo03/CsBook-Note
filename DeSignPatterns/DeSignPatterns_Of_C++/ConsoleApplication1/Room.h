#pragma once
#include "MapSite.h"
#include "Direction.h"

/**
	Room��MapSite�ľ������ָ࣬������MapSite��������ã����ұ���һ�������
	�������������ʾ�Թ��еķ���
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

