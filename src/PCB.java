class PCB {
	int ProcessID;
	int ArrivalTime;
	String State;
	int PositionOfNextInstructionToExecute;
	public void PBC (int processId, int arrivalTime, String state){
		this.ProcessID = processId;
		this.ArrivalTime = arrivalTime;
		this.State = state;
	}
	//To do: PCB data structure of a process
	//for example: Process_id, Arrive_time, state,
	//PositionOfNextInstructionToExecute(PC value)
	//and so on
}