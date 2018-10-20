

class MiddleWare { 
  
  constructor() { 
    this.queue = []    
	} 

	use(fn) {      
	  this.queue.push(fn)        
	  return this    
		
	}
	
	go(fn) {        
		this.queue.push(fn)        
		this.next()    
	}    

	next() 
	{      
		if( this.queue.length > 0  )
			{            
				var fn = this.queue.shift()            
				fn.call(this, this.next.bind(this))        
			}    
	}

}   

module.exports = MiddleWare


