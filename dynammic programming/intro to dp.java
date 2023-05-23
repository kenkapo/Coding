	WHEN TO APPLY DYNAMMIC PROGRAMMING->
	when you are given choices and you are asked to find something optimal.


	RECURRENCE RELATION->
	TO WRITE 1D recurrence relation do the following steps->
	1.express the problem in terms of index.
	2.do all possible stuffs on the index according to the question.
	3.return the thing that the problem is asking for.

	SPACE OPTIMISATION->
	IF THERE IS SOMETHING LIKE index-1 OR index-2 THEN THERE CAN BE ALWAYS SPACE OPTIMISATION.
	1D optimised to some varibles.
	2D optimised to 1D.
	3D optimised to 2D.

	TABULATION->
	1.declare the dp array of same size as declared in memoisation.
	2.base case becomes initialisation.
	3.whatever you write for recursion , write the opposite for tabulation i.e the direction of loops will become opposite.
	4.In memoisation and tabulation, we declare the space same as that of changing parameters i.e. if there is 1 changing parameter ,then make 1d array. If there are 2 changing parameters then make 2d array.
	5.copy the recurrence.
	6.instead of the function name in memoisation, replace that with dp in tabulation.
	7.number of changing states in memoisation = number of nested loops in tabulation. 
	

	Important patterns->
	1.Dp on grids
