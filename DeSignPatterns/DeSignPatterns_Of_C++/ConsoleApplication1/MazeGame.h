#pragma once
#include "Maze.h"
#include "Wall.h"
class MazeGame
{
public:
	static Maze* CreateMaze(void);
};

Maze* MazeGame::CreateMaze(void) {
	Maze* aMaze = new Maze;
	Room* r1 = new Room(r1);
	Room* r2 = new Room(r2);
	Door* theDoor = new Door(r1, r2);

	aMaze->AddRoom(r1);
	aMaze->AddRoom(r2);

	r1->SetSide(North, new Wall);
	r1->SetSide(East, theDoor);
	r1->SetSide(South,new Wall);
	r1->SetSide(West,new Wall);

	r2->SetSide(North,new Wall);
	r2->SetSide(East,new Wall);
	r2->SetSide(South,new Wall);
	r2->SetSide(West, theDoor);

	return aMaze;
}

