import React from 'react';

type Props = {
    selected: boolean
}

const Tab: React.FC<Props> = (props) => {
    return (
        <div role="tab" aria-selected={props.selected}>
        </div>
    )  
}

export default Tab;