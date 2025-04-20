function TitleBar(): JSX.Element {
  return (
    <div className="titlebar flex items-center justify-start m-0 p-0 h-12 w-full bg-transparent">
      <div className="flex justify-end items-center h-full w-1/2 border-r-1 border-zinc-700 pr-4">
        <div className="chevron-right">
          <svg
            xmlns="http://www.w3.org/2000/svg"
            className="h-4 w-4"
            viewBox="0 0 24 24"
            fill="none"
            stroke="grey"
            strokeWidth="2"
            strokeLinecap="round"
            strokeLinejoin="round"
          >
            <path d="M7 18l6-6-6-6" />
            <path d="M13 18l6-6-6-6" />
          </svg>
        </div>
      </div>
      <div className="h-full w-1/2" style={{ backgroundColor: '#331029' }}></div>
    </div>
  );
}

export default TitleBar;
