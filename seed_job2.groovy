job('simpleJobWithParameter') {
  parameters {
  	stringParam('Object','Undescribed','This parameter describes a type of object')
  }
  
  steps {
    shell('echo $JOB_NAME $BUILD_NUMBER')
    shell('echo $Object')
  }
}
