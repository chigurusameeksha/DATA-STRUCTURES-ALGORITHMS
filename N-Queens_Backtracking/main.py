import numpy
def isSafe(board,row,col, N):
    #row wise
   for i in range(N):
       if board[row][i]==1:
           return False
    #col wise
   for i in range(N):
       if board[i][col]==1:
           return False
  #upper left diagonal
   i=row
   j=col
   while(i>=0 and j>=0):
       if board[i][j]==1:
           return False
       i=i-1
       j=j-1
  #upper right diagonal
   i=row
   j=col
   while(i>=0 and j<N):
       if board[i][j]==1:
           return False
       i=i-1
       j=j+1
  #lower left diagonal
   i=row
   j=col
   while(i<N and j>=0):
       if board[i][j]==1:
           return False
       i=i+1
       j=j-1
  #lower right diagonal
   i=row
   j=col
   while(i<N and j<N):
       if board[i][j]==1:
           return False
       i=i+1
       j=j+1
   return True
#logic
def solve(board,col,N):
    if col>=N:
        return True
    for i in range(N):
        if isSafe(board,i,col,N):
            board[i][col] = 1
            if solve(board,col+1,N) == True:
                return True
            board[i][col] = 0
    return False
#main
N=int(input())
board= [[0 for r in range(N)] for c in range(N)]
if solve(board, 0,N) == False:
    print ("Solution does not exist")
for i in range(N):
    for j in range(N):
        print (board[i][j], end = " ")
    print()
