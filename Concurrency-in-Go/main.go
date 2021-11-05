package main

import "sync"

type value struct {
	mu    sync.Mutex
	value int
}

var wg sync.WaitGroup 

printSum := func(v1, v2 *value){
	
}