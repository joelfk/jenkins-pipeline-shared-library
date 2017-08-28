def call(String name = 'Human') {
	def script = libraryResource 'com/crownbet/upsertStack/upsertStack.sh'
	def script1 = script.replace('{NAME}', name)
	sh script1
}