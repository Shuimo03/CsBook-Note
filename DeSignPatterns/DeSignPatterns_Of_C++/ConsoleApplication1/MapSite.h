#pragma once
/*
	所有迷宫构建的公共抽象类
*/

class MapSite
{
public:
	virtual void Enter() = 0; //取决于在哪进入
};
