class PCB {
	//parts of a process
	int ProcessID;
	int ArrivalTime;
	String State;
	//not sure what this one does
	int PositionOfNextInstructionToExecute;
	//contructor
	public PCB (int processId, int arrivalTime, String state){
		this.ProcessID = processId;
		this.ArrivalTime = arrivalTime;
		this.State = state;
	}
	//helpful return method (can add more later)
	public String getProcessState(){
		return this.State;
	}
	//TODO make more methods for acquiring data
}
