all:
	ragel FSM.rl
	ragel -V FSM.rl > test.dot
#	dot -Tpng test.dot > test.png
	g++ FSM.c
