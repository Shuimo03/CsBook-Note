#pragma once
#include "Maze.h"
#include "Wall.h"
#include "Room.h"
class AbstractFactory
{
public:
	AbstractFactory();
	
	virtual Maze* MakeMaze() const {
		return new Maze;
	}

	virtual Wall* MakeWall() const {
		return new Wall;
	}

	virtual Room* MakeRoom(int n) const {
		return new Room(n);
	}

	virtual Door* MakeDoor(Room* r1,Room* r2) const {
		return new Door(r1, r2);
	}

};

Maze MazeGame::CreateMaze()

